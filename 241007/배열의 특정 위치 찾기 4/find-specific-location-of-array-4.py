arr= list(map(int, input().split()))

cnt=0
sum=0
for elem in arr:
    if elem == 0:
        break;
    if elem % 2 == 0:
        sum+=elem;
        cnt+=1
print(f"{cnt} {sum}")