
#Using Default Dict().
from collections import defaultdict
b = defaultdict(int)
for i in dict2:
    b[i] = b[i]+1
print(b)
#Using List Comprehension Method.
b = list(set(dict2))
c = {item.a.count(item) for item in b}
print(c)
