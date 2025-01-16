p = float ( input("Enter principle ="))
r = float ( input("Enter rate ="))
t = float ( input("Enter time ="))
n = float ( input("Enter number of times compounded in a year ="))
CI = p*(1+r/n)**t - p
print ("CI =", CI)