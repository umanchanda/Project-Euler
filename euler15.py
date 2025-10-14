def latticePaths(m, n):
  if m == 0 or n == 0:
    return 0
  elif m == 1 and n == 1:
    return 2
  else:
    return latticePaths(m, n-1) + latticePaths(m-1, n)

print(latticePaths(20,20))