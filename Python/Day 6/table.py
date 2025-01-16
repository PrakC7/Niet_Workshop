#Create the table of the number
def table_out(table_in):
    i=1
    for i in range(1, 11):
        print(table_in*i)
        i = i + 1
table_in = int(input("Enter whose table have to be defined ="))
table_out(table_in)