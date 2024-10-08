# pp, p = map(int, input().split())
# print(pp,p, end=" ")
# for _ in range(3,11):
#     pp, p = p, pp+ p
#     print(p%10, end=" ")

pp, p = map(int, input().split())
arr=[pp,p]
for _ in range(2,10):
    pp, p = p, pp + p
    arr.append(p)
for i in arr:
    print(i%10, end=" ")