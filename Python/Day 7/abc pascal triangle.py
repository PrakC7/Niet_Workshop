#MAKING PASCAL TRIANGLES USING ALPHABETS
def pascal_triangle_alphabets_3():
    for i in range(1, row+1):
        print(" " * (row - i), end="")
        for j in range(2 * i-1):
            if j%2==0:
                print("B", end="")
            else:
                print("A", end="")
        print()

row =int(input("Enter the value of row:"))

pascal_triangle_alphabets_3()