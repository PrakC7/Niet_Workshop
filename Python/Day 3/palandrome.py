n = int(input("Enter number="))
t = n
rev = 0
while n != 0:
    d = n % 10
    rev = (rev * 10)+d
    n = n // 10
if (rev==t):
    print(t, " is Palandrome")
else:
    print(t, "is Not Palandrome")

