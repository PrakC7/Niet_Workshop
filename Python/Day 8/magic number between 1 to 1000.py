def digital_root(n):
    while n >= 10:
        n = sum(int(digit) for digit in str(n))
    return n

def is_magic_number(n):
    return digital_root(n) == 1

# Check magic numbers in the range 1 to 1000
magic_numbers = [n for n in range(1, 1001) if is_magic_number(n)]

print("Magic numbers between 1 and 1000:", magic_numbers)
