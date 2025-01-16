
def remove_consonants():
    vowels="aeiouAEIOU"
    result = "".join([char for char in w if char in vowels])
    return result
w= str(input("Enter the word="))
nv= remove_consonants()
print(nv)




def remove_vowels():
    vowels="aeiouAEIOU"
    result = "".join([char for char in w if char not in vowels])
    return result
nc= remove_vowels()
print(nc)




