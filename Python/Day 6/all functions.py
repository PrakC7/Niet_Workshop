#All operations on num1 and num2.
def all_calculator_operations():
    result ="Sum :", num1 + num2, "Substraction :", num1 - num2, "Product :", num1 * num2, "Quotient :", num1 / num2, "Exponential :", num1 ** num2, "Quotient(nearest to the integer) :", num1 // num2,  "Reminder :", num1 % num2
    print(result)
num1 = float(input("_"))
num2 = float(input("__"))
all_calculator_operations()