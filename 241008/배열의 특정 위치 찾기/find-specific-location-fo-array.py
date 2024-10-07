arr = list(map(int, input().split()))

second_arr_sum = sum(arr[1::2])
third_arr = arr[2::3]
third_arr_sum = sum(third_arr);

print(f"{second_arr_sum} {third_arr_sum/len(third_arr):.1f}");