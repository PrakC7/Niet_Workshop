#string formatting by use of format () method
name = "Alice"
age = 20
print("My name is {} and I am {} years old.".format(name,age))
#With help of f-strings(Python 6.0+)
name = " Bob Marley"
age = 30
print(f"My name is {name} and I am {age} years old.")
#% Operator (Old Method)
name = "Eve"
age = 30
print("My name is %s and I am %d years old."% (name, age))