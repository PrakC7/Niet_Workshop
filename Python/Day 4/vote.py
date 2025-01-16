age = int(input("Enter age="))
if age<= 0:
    print("Invalid")
elif age >=18:
    citizen = str(input("Citizenship=")).upper()
    if citizen == "INDIAN":
        print("Eligible")
else:
    print("Not Eligible")