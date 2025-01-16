def pascal_triangle_alphabets_3():
    for i in range(row):
        for j in range(row - i):
            print(chr(65+j), end=" ")
        for k in range(2 * i):
            print(" ", end=" ")
        for j in range(row - i-1, -1, -1):
            print(chr(65 + j), end=" ")
        print()

row =int(input("Enter the value of row:"))

pascal_triangle_alphabets_3()