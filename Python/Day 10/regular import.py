#For Regular Imports.
import re
print(re.match("a,b", "abc"))
print(re.search("a,b", "abc"))
print(re.search("dog", "a dao is here"))
print(re.findall("a.b", "abc"))
print(re.findall("\d", "A123B456"))
print(re.search("\s", "Hello World"))
#1. Matches any characters except newline.
#2. \d matches digits(0-9)
#3. \w matches alphanumeric characters.
#4. \s matches whitespaces characters.
#5. * matches 0 or repetitions.
#6. + matches 1 or more repetitions.
#7. ? matches 0 or 1 repetitions.
print(re.findall(r"\d+","My age is 25 and yours is 30."))
print(bool(re.match(r"Hello","Hello World.")))
print(re.sub(r"\s","_","Hello World."))
