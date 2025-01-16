# Function to check if a number is prime
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

# List to store prime numbers
prime_numbers = [x for x in range(1, 101) if is_prime(x)]

# Print the prime numbers
print(prime_numbers)