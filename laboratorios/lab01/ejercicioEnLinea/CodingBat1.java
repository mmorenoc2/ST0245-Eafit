public class CodingBat1
{
    // factorial
    // Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 
    // 1. Compute the result recursively (without loops).

    public int factorial(int n) 
    {
        if (n == 1) 
            return 1;
        else
        return n * factorial(n-1);
    }

    //bunnyEars
    //We have a number of bunnies and each bunny has two big floppy ears. 
    //We want to compute the total number of ears across all the bunnies recursively 
    //(without loops or multiplication).

    public int bunnyEars(int bunnies) 
    {
      if (bunnies == 0) 
         return 0;
      else
      return 2 + bunnyEars(bunnies-1);
    }

    //sumDigits
    // Given a non-negative int n, return the sum of its digits recursively (no loops). 
    //Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) 
    //by 10 removes the rightmost digit (126 / 10 is 12).
    public int sumDigits(int n)
    {
      if(n < 10)
        return n;
      else
      return sumDigits(n/10) + n%10;
    }

    //powerN
    // Given base and n that are both 1 or more, compute recursively (no loops) 
    //the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    public int powerN(int base, int n)
    {
      if(n == 1)
        return base;
      else
      return base*powerN(base, n - 1);
    }

    //endX
    //Given a string, compute recursively a new string where all the lowercase 'x' chars 
    //have been moved to the end of the string.
    public int countX(String str)
    {
      if(str.length() == 0)
        return 0;
      if(str.charAt(0) == 'x')
        return 1 + countX(str.substring(1));
      return countX(str.substring(1));
    }



}