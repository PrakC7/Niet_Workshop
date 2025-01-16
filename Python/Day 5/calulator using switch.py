a = int(input("Enter the number="))
b = int(input("Enter the other number="))
n = str(input("Operation="))
match n:
    case "+":
        print(a+b)
    case "-":
        print(a-b)
    case "*":
        print(a*b)
    case "/":
        print(a/b)
    case "^":
        print(a**b)
    case "//":
        print(a//b)
    case "%":
        print(a%b)
    case _:
        print("Invalid.")


