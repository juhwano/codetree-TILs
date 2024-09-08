result=0
cnt=0
while True:
    n=int(input())
    if n < 20 or n > 29:
        print(f"{result/cnt:.2f}")
        break
    result+=n
    cnt+=1