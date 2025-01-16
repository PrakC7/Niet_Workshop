#TUPLES ARE IMMUTABLE SEQUENCES.
my_tuple = (1,2,3)
print(my_tuple.count(3))
print(my_tuple.index(3))

#USE OF PACKING AND UNPACKING IN TUPLES.
def sum_and_multiply(a,b):
    return a+b, a*b
result_sum,result_mul = sum_and_multiply(4,5)
print(result_sum)
print(result_mul)

#PROBLEM STATEMENT : CREATE A LIST OF SQUARES FOR ALL ODD NUMBERS BETWEEN 1 TO 100.
odd_square = [x**2 for x in range(1,101) if x % 2 != 0]
print(odd_square)
