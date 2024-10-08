arr = list(map(int, input().split()))

even_sum=sum(arr[::2])
odd_sum=sum(arr[1::2])

print(even_sum-odd_sum if even_sum > odd_sum else odd_sum-even_sum)