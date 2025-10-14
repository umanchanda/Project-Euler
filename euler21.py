def isAmicable(a, b) -> bool:
  suma, sumb = 0, 0
  for i in range(1, a//2+1):
    if a % i == 0:
      suma += i
  
  for j in range(1, b//2+1):
    if b % j == 0:
      sumb += j
  
  return suma == b and sumb == a

def sumAmicable():
  s = 0
  for i in range(10000):
    for j in range(10000):
      if isAmicable(i, j) and i != j:
        print(i,j)
        s += (i+j)
  
  return s//2

print(sumAmicable())