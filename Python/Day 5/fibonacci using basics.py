# Ask the user to input the number of terms (n)
n = int(input("Enter the number of terms: "))

# First two Fibonacci numbers
a, b = 0, 1

# Print the Fibonacci sequence up to n terms
print("Fibonacci Series up to", n, "terms:")
for _ in range(n):
    print(a, end=" ")  # Print the current Fibonacci number
    a, b = b, a + b    # Update a and b to the next two Fibonacci numbers
