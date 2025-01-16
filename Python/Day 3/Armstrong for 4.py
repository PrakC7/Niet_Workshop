num = int(input("Enter a number ="))
t = num
sum=0
c = len(str(num))
while t !=0:
    div = t % 10
    sum += div ** c
    t = t//10

if sum == num:
    print("Armstrong Number")
else:
    print("Not Armstrong")