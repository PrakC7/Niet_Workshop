#FIBONACCI SERIES OF A NUMBER
def fib(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fib(n-1)+fib(n-2)
num = int(input("Enter a number: "))
for i in range(num):
    z = fib(i)
    print(z)