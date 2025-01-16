#CHECK FOR THE MAGIC NUMBER.
def digital_root(n):
    while n >= 10:
        n = sum(int(digit) for digit in str(n))
    return n

def is_magic_number(n):
    return digital_root(n) == 1

#TEST FOR FUNCTION.
number = int(input("Check if the number is Magic"))
if is_magic_number(number):
    print(f"{number} is a magic number!")
else:
    print(f"{number} is not a magic number.")