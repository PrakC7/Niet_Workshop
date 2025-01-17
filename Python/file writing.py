#FILE WRITING.
#Using 'w' mode to create a file.
with open("day11.txt") as f:
    f.write("Hello world\n")
    f.write("This is the second line\n")
    f.write("This is the third line\n")
    f.write("This is the fourth line\n")
print("File created.")
#APPENDING TO FILE.
with open("day11.txt") as f:
    f.write("\nThis is appended.")
#READING AN ENTIRE FILE.
with open("day11.txt") as f:
    contents = f.read()
    print(contents)
#READING LINE BY LINE.
with open("day11.txt", "r") as f:
    for line in f:
        print(line.strip())
#READING SPECIFIC NUMBERS OF CHARACTERS.
with open("day11.txt", "r") as f:
    for line in f:
        contents = f.read(10)
        print(contents)
