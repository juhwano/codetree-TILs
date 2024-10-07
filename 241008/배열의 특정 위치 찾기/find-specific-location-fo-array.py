arr = list(map(int, input().split()))

second_arr_sum = sum(arr[1::2])
third_arr = [i for i in arr if i%3==0]
third_arr_sum = sum(third_arr);

print(f"{second_arr_sum} {third_arr_sum/len(third_arr)}");