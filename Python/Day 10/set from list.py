#CREATING SET FROM A GIVEN LIST.
my_set_from_list=[1,2,3]
my_set= set(my_set_from_list)
print(type(my_set))
my_set.add(4)
print(type(my_set))
my_set.remove(4)
print(type(my_set))
my_set.discard(4)
print(type(my_set))
removed = my_set.pop()
print(my_set)
my_set.clear()
print(my_set)
set1 = {1,2,3}
set2 = {4,5,6}
print(set1.union(set2))
print(set1.intersection(set2))
