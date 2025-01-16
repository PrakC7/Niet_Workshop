#USE OF FUNCTION TO FILTRATE
def adult(age):
    if age >= 18:
        return True
    else:
        return False
a = filter(adult, age)
for i in a:
    print(i, end=" ")
