public class CodingBat2
{
  //groupSum6
   // Given an array of ints, is it possible to choose a group of some of the ints, 
   //beginning at the start index, such that the group sums to the given target? 
   //However, with the additional constraint that all 6's must be chosen. (No loops needed.)

      public boolean groupSum6(int start, int[] nums, int target)
      {
        if(start == nums.length)
        {
          if(target == 0)
            return true;
          return false;
        }
        if(nums[start] == 6)
          return groupSum6(start + 1, nums, target - nums[start]);
        if(groupSum6(start + 1, nums, target - nums[start]))
          return true;
        return groupSum6(start + 1, nums, target);
      }

    //groupNoAdj
    // Given an array of ints, is it possible to choose a group of some of the ints,
    // such that the group sums to the given target with this additional constraint: 
    //If a value in the array is chosen to be in the group, the value immediately following it 
    //in the array must not be chosen. (No loops needed.)

    public boolean groupNoAdj(int start, int[] nums, int target)
    {
      if(target == 0)
        return true;
      if(start >= nums.length)
        return false;
      if(groupNoAdj(start + 2, nums, target - nums[start]))
        return true;
      return groupNoAdj(start + 1, nums, target);
    }

    // Given an array of ints, is it possible to choose a group of some of the ints, 
    //such that the group sums to the given target, with this additional constraint: 
    //if there are numbers in the array that are adjacent and the identical value, 
    //they must either all be chosen, or none of them chosen. 
    //For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be 
    //chosen or not, all as a group. (one loop can be used to find the extent of the identical values).
    
    public boolean groupSumClump(int start, int[] nums, int target)
    {
      if(start >= nums.length)
      {
        if(target == 0)
          return true;
        return false;
      }
      int i = start + 1;
      for(;  i < nums.length && nums[start] == nums[i]; i++);
      if(groupSumClump(i, nums, target - ((i - start) * nums[start])))
        return true;
      return groupSumClump(i, nums, target);	
    }
}