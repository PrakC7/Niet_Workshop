# Ask the user to input the number of terms (n)
def fact():
    n = int(input("Number! :"))
    f =1
    i=1
    while i <= n:
        f = f * i
        i = i + 1
    print("Factorial :", f)
fact()


