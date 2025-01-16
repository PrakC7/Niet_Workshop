#Factorial using Recursion
def fact():
    if n == 0:
        return 1
    else:
        return n * fact(n - 1)
n = int(input("Enter a number:"))
fact()
