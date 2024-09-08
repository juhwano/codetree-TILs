cnt=0

n=int(input())

while True:
    if n % 2:
        n = n * 3 + 1
        cnt+=1
    else:
        n= n // 2
        cnt+=1
    
    if n == 1:
        print(cnt)
        break