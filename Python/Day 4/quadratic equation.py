import math
a = int(input("Coefficient of x^2="))
b = int(input("Coefficient of x="))
c = int(input("Constant Term="))
if (b**2 - 4*a*c)>=0:
    alpha = (-b + math.sqrt(b ** 2 - 4 * a * c)) / 2 * a
    beta = (-b - math.sqrt(b ** 2 - 4 * a * c)) / 2 * a
    Qe = (alpha, beta)
    print("Real roots=", Qe)
else:
    print("Can't perform the task.")



