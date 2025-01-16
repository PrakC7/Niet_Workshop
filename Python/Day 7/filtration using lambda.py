#FILTRATION OF EVEN NUMBERS
num= [5,18,23,15,25,65,74,85,12]
even_num = filter(lambda x: x % 2 == 0, num)
even_num_list = list(even_num)
print(even_num_list)
#FILTRATION OF ADULTS
age = [5,18,23,15,25,65,74,85,12]
adults = list(filter(lambda x: x >=18, age))
print(adults)