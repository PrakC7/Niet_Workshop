#IMPLEMENT A PROGRAM TO CHECK IF ONE SET IS A SUBSET OF ANOTHER.
# Function to check if set A is a subset of set B
def is_subset(A, B):
    return A.issubset(B)

# Example usage
s1 = {1, 2, 3}
s2 = {1, 2, 3, 4, 5}

# Check if set_A is a subset of set_B
if is_subset(s1, s2):
    print("s1 is a subset of s2")
else:
    print("s1 is not a subset of s2")

