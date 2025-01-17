#WRITE A PROGRAM THAT TAKES USER INPUTS AND CALCULATES THE SQUARE ROOT. HANDLE INVALID INPUTS.
import math
def get_square_root():
    while True:
        try:
            # Ask the user for input
            n = input("Input: ")

            # Try to convert input to a float
            number = float(n)

            # Check if the number is negative
            if number < 0:
                raise ValueError("Cannot calculate the square root of a negative number.")

            # Calculate and display the square root
            result = math.sqrt(number)
            print(f"Square root({number})={result:.2f}")
            break

        except ValueError as e:
            # Catch both invalid inputs and negative number errors
            print(f"Error: {e}. Please enter a valid non-negative number.")
# Run the program
get_square_root()
