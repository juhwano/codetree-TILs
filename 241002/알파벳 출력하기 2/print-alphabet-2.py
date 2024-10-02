n = int(input())
asc = 65;
for i in range(n, 0, -1):
    for j in range(n, 0, -1):
        if (j>i):
            print("  ", end="")
        else:
            print(chr(asc), end=" ")
            asc+=1;
            if asc==91:
                asc=65;
    print();