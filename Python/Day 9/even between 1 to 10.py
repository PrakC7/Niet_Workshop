# Given range from 1 to 10
even_numbers = [x for x in range(1, 11) if x % 2 == 0]

# Square the even numbers
squared_even_numbers = [x ** 2 for x in even_numbers]

# Print the squared even numbers
print(squared_even_numbers)
