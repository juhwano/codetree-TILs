arr = list(map(int,input().split()))
cnt=0
sum=0
for elem in arr:
    if elem >= 250:
        break;
    sum+=elem;
    cnt+=1

avg = sum / cnt;
print(f"{sum} {avg:.1f}")