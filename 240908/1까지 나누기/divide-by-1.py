n = int(input())
result = n
cnt = 1
for i in range(2,100):
    result //= i
    cnt+=1
    if result <=1:
        print(cnt)
        break