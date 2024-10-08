arr = list(map(int, input().split()))
k=0
for i in range(len(arr)):
    if arr[i]%3 ==0:
        k=i
        break;
print(arr[k-1])