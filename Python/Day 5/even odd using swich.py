n = int(input("Number?(Even/Odd) ="))
d = n%2
match d:
    case 0:
        print(n, "is even.")
    case _:
        print(n, "is odd.")

