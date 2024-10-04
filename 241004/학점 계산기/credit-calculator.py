n = int(input())
grades = list(map(float, input().split()))
avg = sum(grades) / len(grades)
print(f"{avg:.1f}");
print("Perfect" if avg >=4.0 else "Good" if avg>=3.0 else "Poor");