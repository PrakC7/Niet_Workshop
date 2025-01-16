#COMBINED DATASETS.
mixed_dict= {"Fruits":{"Apple","Banana","Cherry","Strawberry"},"Veggies":{"Carrot","Cauliflower","Onion","Tomato"}}
for category in mixed_dict:
    print(f"{category}:{mixed_dict[category]}")
for category, items in mixed_dict.items():
    print(f"{category}:{items}")