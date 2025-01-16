#CREATE A PROGRAM TO REMOVE DUPLICATIONS FROM A LIST USING A SET.
# Function to remove duplicates from a list
def remove_duplicates():
    # Convert the list to a set, which automatically removes duplicates
    return list(set(input_list))

# Example usage
input_list = [1, 2, 2, 3, 3, 3, 4, 4]
result_list = remove_duplicates()

print("Original List:", input_list)
print("List after removing duplicates:", result_list)
