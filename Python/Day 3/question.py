def get_firstname(Full_name):
    names = Full_Name.split(" ")
    initials = "".join([name[0], name[1], name[2].upper() for name in names])
    return initials
name = " Ram Kumar"
print(initials)