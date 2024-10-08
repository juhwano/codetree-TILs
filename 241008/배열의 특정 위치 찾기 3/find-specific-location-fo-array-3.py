arr = list(map(int, input().split()))

sum=0
for i in range(len(arr)):
    if arr[i] == 0:
        break;
    sum+=arr[i]
print(sum)