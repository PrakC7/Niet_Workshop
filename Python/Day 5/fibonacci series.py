def fibonacci(n):
    # Initialize the first two Fibonacci numbers
    fib_series = [0, 1]

    # Generate the Fibonacci series up to n
    for i in range(2, n):
        next_fib = fib_series[-1] + fib_series[-2]
        fib_series.append(next_fib)

    # Return the Fibonacci series up to n
    return fib_series[:n]


# Input: n (number of terms in the Fibonacci series)
n = int(input("Enter the value of n: "))

# Generate the Fibonacci series
fib_series = fibonacci(n)

# Print the Fibonacci series
print("Fibonacci Series up to", n, ":", fib_series)
