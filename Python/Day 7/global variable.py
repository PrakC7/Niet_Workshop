x = 10
def sum():
    y=20

    def innerfun():
        nonlocal y
        y +=10
        print(f"Nonlocsl variable is :{y}")
    innerfun()

print(f"Global variable is :{x}")
sum()
