#CHECK FOR THE MAGIC NUMBER.
def digital_root(n):
    while n >= 10:
        n = sum(int(digit) for digit in str(n))
    return n

def is_magic_number(n):
    return digital_root(n) == 1

#TEST FOR FUNCTION.
start = 1
end = 200
list_magic = []
def magic(x):
    digit_sum = 0
    num = x
    while num > 0:
        digit_sum += num % 10
        num = num//10
    return digit_sum
for i in range(start, end+1):
    digi_sum = magic(i)
    while digi_sum > 9:
        digi_sum = magic(digi_sum)
    if digi_sum == 1:
        list_magic.append(i)
print("Magic number between 1 to 200 :\n", list_magic)