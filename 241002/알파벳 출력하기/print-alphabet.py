n = int(input())

A = 65
for i in range(n):
    for j in range(i+1):
        print(chr(A), end="")
        A+=1
        if A==91:
            A=65
    print()