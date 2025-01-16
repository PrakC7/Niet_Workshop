#Keyword Arguments
def my_func(**n):
    print(f"The first name is {n['first']}",
          f"The last name is {n['last']}")
my_func(first="John.", last="Smith.")

