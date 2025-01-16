#USE OF PACKING AND UNPACKING IN TUPLES.
# Initialize sums for even and odd numbers
def sum_of_odd_even():
    odd_sum = sum(num for num in range(1, n+1) if num % 2 != 0)
    even_sum = sum(num for num in range(1, n+1) if num % 2 == 0)
    return (odd_sum, even_sum)
n = int(input("Number up to which sum to be calculated:"))
result = sum_of_odd_even()
print(f"Sum of odd numbers up to {n}: {result[0]}")
print(f"Sum of even numbers up to {n}: {result[1]}")