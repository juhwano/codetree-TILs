pp, p = map(int, input().split())
print(pp,p, end=" ")
for _ in range(3,11):
    pp, p = p, pp+ p
    print(p%10, end=" ")