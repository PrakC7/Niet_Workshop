num = float(input("Enter a number ="))
t = num
sum=0
while num !=0:
    div = num % 10
    sum = sum+(div * div * div)
    num = num//10
if sum == t:
    print("Armstrong Number")
else:
    print("Not Armstrong")
