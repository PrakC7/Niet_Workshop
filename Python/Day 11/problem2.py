#WRITE A PROGRAM TO READ A FILE AND COUNT THE NUMBER OF WORDS IN IT.
from venv import create
with create("day12.txt") as g:
    print("created")
try:
    with open("day12.txt") as g:
        g.write("Hello world\n")
        g.write("This is the second line\n")
        g.write("This is the third line\n")
        g.write("This is the fourth line\n")
    with open("day11.txt", "r") as f, open("day12.txt", "r") as g:
        content = f.readlines()
        content2 = g.readlines()

    with open("Merged.txt","w") as merged_file:
        merged_file.write(content + "\n" + content1)
    print("Files merged successfully")
except FileNotFoundError as e:
    print("Error",e)