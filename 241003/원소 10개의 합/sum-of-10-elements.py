# print(sum(list(map(int, input().split()))))

li = list(map(int, input().split()))
sum=0
for elem in li:
    sum += elem
print(sum)