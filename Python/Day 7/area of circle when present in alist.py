#MAP FILTRATION TO FIND AREA OF CIRCLES OF A LIST OF RADIUS
r_list = [1,2,3,4,5,6,7,8,9,10]
circle_area_list = list(map(lambda x: 3.14 * x ** 2, r_list))
print(circle_area_list)