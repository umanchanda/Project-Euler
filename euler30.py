nums = []
for i in range(10):
  for j in range(10):
    for k in range(10):
      for l in range(10):
        for m in range(10):
          for n in range(10):
            num = int(str(i) + str(j) + str(k) + str(l) + str(m) + str(n))
            if i**5 + j**5 + k**5 + l**5 + m**5 + n**5 == num:
              nums.append(num)

print(sum(nums[2:]))