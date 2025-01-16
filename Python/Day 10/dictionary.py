#EMPTY DICTIONARY.
empty_dict={}
print(type(empty_dict))
#NON-EMPTY DICTIONARY.
my_dict = {"Name":"Alice","Age":25,"City":"New york"}
print(my_dict)
#USING DICT( CONSTRUCTOR.
constructed_dict = dict(name="Charlie", age=25, city="New Delhi")
print(constructed_dict)
print(my_dict.get("Name"))
print(list(my_dict.keys()))
print(list(my_dict.values()))
print(list(my_dict.items()))
my_dict.update({"City":"London"})
print(my_dict)
print(my_dict.pop("City"))
print(my_dict.popitem())
print(my_dict.clear())