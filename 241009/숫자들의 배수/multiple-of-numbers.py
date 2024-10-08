n = int(input())
cnt=1
cnt2=0
while(True):
    if (cnt2 == 2):
        break
    print(n*cnt, end=" ")
    if (n*cnt % 5 ==0):
        cnt2+=1
    cnt+=1