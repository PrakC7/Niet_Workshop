#REDUCTION OF NUM_LIST
from functools import reduce
num_list=[10,1,52,74,65,86,67,98,99,110]
large = reduce(lambda x,y: x if x>y else y, num_list)
print(large)