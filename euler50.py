def is_prime(num):
  for i in range(2, num-1):
    if num % i == 0:
      return False
  return True

lst_of_primes = []
num = 2
while num < 1000:
  if is_prime(num):
    lst_of_primes.append(num)
  num = num + 1


print(lst_of_primes)