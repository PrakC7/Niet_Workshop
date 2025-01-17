#TRY
try:
    #CODE THAT MIGHT RAISE AN EXCEPTION.
    number = int(input("Enter a number: "))
    result = 10/number
    print("Result:",result)
except Exception:
    #CODE TO HANDLE THE EXCEPTION.
    print("Error occured!: Division by zero is not allowed.")
except ValueError:
    print("Error occured!: Invalid input. Please try again.")