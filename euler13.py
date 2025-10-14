with open('euler13.txt', 'r') as f:
  s = f.read()

n = s.split("\n")
numbers = []
for x in n:
  numbers.append(int(x))

print(str(sum(numbers))[:10])