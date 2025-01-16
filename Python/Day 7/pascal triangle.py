def pascal_triangle():
    for i in range(row):
        value=1
        print(" "*(row - i), end="")
        for j in range(i+1):
            print(value , end=" ")
            value=value*(i-j)//(j+1)
        print()

row =int(input("Enter the value of row:"))

pascal_triangle()