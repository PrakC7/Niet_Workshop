# Function to print the triangle pattern with numbers
def print_triangle_numbers(n):
    # Loop to print each row
    for i in range(1, n + 1):
        # Generate the row with numbers from 1 to i
        row = [str(j + 1) for j in range(i)]  # Numbers from 1 to i
        print(" ".join(row))

# Input: Get the value of n (number of numbers)
n = int(input("Enter the number: "))

# Call the function with the input value
print_triangle_numbers(n)