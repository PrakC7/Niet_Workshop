num = int(input("Enter year="))
if (num % 4 == 0 and num % 100 != 0) or (year % 400 == 0):
    print(num, "is leap year")
else:
    print(num, "is not leap year")