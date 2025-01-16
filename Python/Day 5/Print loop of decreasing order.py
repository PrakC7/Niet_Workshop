n = int(input("Number of your choice ="))
for i in range(1, n):
    print('' *(n - i), end="")
    for j in range(n, n-i, -1):
        print(j, end="")
    print(i)
