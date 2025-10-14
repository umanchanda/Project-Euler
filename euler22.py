with open('euler22.txt', 'r') as f:
  s = f.read()

n = s.split(",")
names = []
for x in n:
  names.append(x[1:-1])

names = sorted(names)

master_score = 0
for i,j in enumerate(names):
  s = 0
  for c in j:
    s += (ord(c) - 64)
  score = (i+1) * s
  master_score += score

print(master_score)