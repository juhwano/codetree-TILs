arr = list(map(int, input().split()))

sum=0
for i in range(len(arr)):
    if arr[i] == 0:
        sum = arr[i-1] + arr[i-2] + arr[i-3]
        break;
    sum = arr[-1] + arr[-2] + arr[-3]
print(sum)