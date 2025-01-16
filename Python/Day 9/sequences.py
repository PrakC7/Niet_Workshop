#SEQUENCES ARE ORDERED COLLECTIONS OF ITEMS
# 1 STRINGS
# 2 LISTS
# 3 TUPLES
#ALL SEQUENCES SHARE COMMON OPERATIONS SUCH AS INDEXING, SLICING AND
#PACKING EXAMPLE.
packed = 1,2,3,4,5
print(packed)
#UNPACKING EXAMPLE.
x,y,z = 10,20,30
print(x,y,z)
#USING * TO COLLECT REMAINING ITEMS.
*a, b = [1,2,3,4,5]
print(a,b)
#EXAMPLE WITH A FUNCTION.
def return_multiple():
    return 5,10,20
#MUTABLE AND IMMUTABLE.
my_list = [1,2,3,4,5]
print(my_list)
my_list[1]=23
print(my_list)
my_list.append(44)
print(my_list)
#IMMUTABLE SEQUENCES.
#STRINGS.
text = "Hello this is ninth day of python training."
print(text)
# text[0]='h'
# print(text)
#TUPLES.
my_tuple = (1,2,3,4,5)
print(my_tuple)
# my_tuple[0]=122
# print(my_tuple)
test="helLO"
print(test)
print(test.capitalize())
print(test.casefold())
print(test.lower())
print(test.upper())
print(test.title())
print(test.swapcase())
print(test.find("e"))
print(test.rfind("l"))
print(test.index("l"))
print(test.count("l"))
print(test.replace("l","h"))
print(test.split("l"))
print(test.rsplit(","",",1))
print(text.splitlines())
print("a,b,c,d,e,f,g,h".strip(","))
print("a,b,c,d,e,f,g,h".rsplit(",",1))
print(" Hello".strip())
test2 = "_Hello_"
print(test2.lstrip())
print(test2.startswith("H"))
print(test2.endswith("H"))
print(test2.join(["","new","World"]))
print(test2.isalpha())
print(test2.isnumeric())
print(test2.isalnum())
test3 = "123"
test4 = "123abc"
test2 = " Hello "
print(test3.isdigit())
print(test4.isdigit())
print(test2.isspace())
print(test2.isupper())
print(test2.islower())
print(len(test2))
print("Hello, {}".format(test2))
print("42".zfill(5))
print(test2.center(10))
print(test2.ljust(10))
print(test2.rjust(10))
test5 = "HELLO hello"
print(test5.casefold())
print(test5.lower())








