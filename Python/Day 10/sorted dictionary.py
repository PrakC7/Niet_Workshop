def merge_and_sort_dict(dict1,dict2):
    merge_dict = dict1.copy()
    merged_dict.update(dict2)
    sorted_dict = {key: merge_dict[key] for key in sorted(merge_dict)}
    return sorted_dict
# dict1 = {'b':2,"a":3

#Method Two.
dict1 = {'b':2,"a":3,"c":4}
dict2 = {'e':5,"d":6}
merge_dictionary = dict(sorted({**dict1,**dict2},items()))
print("Merge and Sorted Dictionary:",merge_dictionary)