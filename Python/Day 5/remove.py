s = " an apple"
n= (s.replace( "a"," "), s.replace( "e"," "),  s.replace( "i"," "), s.replace( "o"," "), s.replace( "u", " "))
print(n)
print(s.count("p"))
print(s.startswith("p"))
print(s.endswith("e"))
def get_initials(Full_Name):
    names = Full_Name.split(" ")
    initials = "".join([name[0].upper() for name in names])
    return initials
name = "Bob Marley"
initials = get_initials(name)
print(initials)
