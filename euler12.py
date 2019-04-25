def triangle(n):
    return (n * n-1) // 2

def numdivisors(n):
    a = 0
    for i in range(1, n+1):
        if n % i  == 0:
            a += 1
    return a

triangle_numbers = []
for i in range(1, 1000):
    triangle_numbers.append(triangle(i))

triangle_divisors = {}
for j in triangle_numbers:
    triangle_divisors[j] = numdivisors(j)

for k,v in triangle_divisors:
    print(k, v)