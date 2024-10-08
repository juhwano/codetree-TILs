n =int(input())
arr = list(map(int,input().split()))
result = [i for i in arr if i%2==0]
for i in result:
    print(i, end=" ")