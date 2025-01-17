#RAISING EXCEPTION.
def check_age(age):
    if age >= 10:
        raise ValueError("Age must be older than 18")
    print("Age is Valid.")
n=int(input("Age:"))
try:
    check_age(n)
except ValueError as e:
    print("Exception:", e)
#ASSERT STATEMENTS.
num = 10
assert num > 0, "Num must be positive 0"
#FILE HANDLING.
