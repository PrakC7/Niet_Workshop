#WRITE A PROGRAM TO PERFORM LOOP OVER DICTIONARIES.
my_dict = {"Name":"Charlie","Subject":"Python","Marks":"29"}
print(type(my_dict))
for key in my_dict:
    print(key)
#LOOP[ THROUGH VALUES.
for value in my_dict.values():
    print(value)
#LOOP THROUGH KEY-VALUE PAIR.
for key, value in my_dict.items():
    print(f"{key}: {value}")