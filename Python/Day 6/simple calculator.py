a = float(input("Enter a number="))
b = float(input("Enter other number="))
o = str(input("Operation ="))
if o=="+":
    print("Sum =", a+b)
if o=="-":
    print("Sub =", a-b)
if o=="*":
    print("Product =", a*b)
if o=="/":
    print("Quotient =", a/b)
if o=="%":
    print("Reminder =", a%b)
if o=="^":
    print("Power =", a**b)
if o=="//":
    print("Quotient(approx.)", a//b)
else:
    print("Invalid")








