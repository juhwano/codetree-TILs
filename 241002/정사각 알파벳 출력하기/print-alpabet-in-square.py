n = int(input())
A = 65
for i in range(n):
    for j in range(n):
        print(chr(A), end="")
        A+=1
    print()