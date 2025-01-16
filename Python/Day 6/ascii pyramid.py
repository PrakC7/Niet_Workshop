# Function to print the triangle pattern
def print_triangle(n):
    # Loop to print each row
    for i in range(1, n + 1):
        # Generate the row based on the ASCII value of 'a' and the index
        row = [chr(65 + j) for j in range(i)]  # 65 is ASCII value of 'A'
        print("".join(row))

# Input: Get the value of n (number of alphabets)
n = int(input("Enter the number of alphabets: "))

# Call the function with the input value
print_triangle(n)
