#FILTRATION
n = [1,2,3,4,5,6,7,8,9,10]
def is_even(num):
    if num % 2 == 0:
        return True
#FILTRATION TO GET EVEN NUMBERS
even_numbers = filter(is_even, n)
#CONVERSION OF FILTERED OBJECTS TO A LIST
even_numbers_list=list(even_numbers)
print(even_numbers)