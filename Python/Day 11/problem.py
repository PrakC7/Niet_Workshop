#WRITE A PROGRAM TO READ A FILE AND COUNT THE NUMBER OF WORDS IN IT.
try:
    with open("day11.txt") as f:
        content = f.readlines()
        words = content.split()
        print("Word Count:",len(words))
except FileNotFoundError:
    print("No such file or directory exits")