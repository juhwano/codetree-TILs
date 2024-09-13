a,b=map(int,input().split())

cv = False

for i in range(a,b+1):
    if 1920 % i == 0 and 2880 % i == 0:
        cv=True
        break

if cv:
    print('1')
else:
    print('0')