#BIONOMIAL COEFFICIENT OF A GIVEN NUMBER W.R.T. R
def binomial_coefficient():
    if r>n or n<0 or r<0 :
        print("Invalid.")
    else:
        n_fact=1
        for i in range(1, n + 1):
            n_fact *= i

        r_fact = 1
        for i in range(1, r + 1):
            r_fact *= i

        n_minus_r_fact = 1
        for i in range(1, n-r+1):
            n_minus_r_fact *= i

        binomial = n_fact / ((r_fact * n_minus_r_fact))
        print("The binomial coefficient of", n, "w.r.t.", r, "is", binomial)

n = int(input("Enter n="))
r = int(input("Enter r="))

binomial_coefficient()