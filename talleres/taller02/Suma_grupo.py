def Suma_grupo(start, nums, target):
  if start >= len(nums):
    return target == 0
  else:
    return (Suma_grupo(start + 1, nums, target - nums[start]) or Suma_grupo(start + 1, nums, target))

print(Suma_grupo(0,[2, 4, 8],10))