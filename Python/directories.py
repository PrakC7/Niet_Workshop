import  os
#GET CURRENT DIRECTORY.
current_dir = os.getcwd()
print("Current directory: {}",os.getcwd())
#CHANGE DIRECTORY.
os.chdir("/Python/to/")
print("Changed directory: {}",os.getcwd())
#MAKE DIRECTORY.
os.mkdir("Day_11")
#REMOVE DIRECTORY.
os.rmdir("Day_11")
#LIST CONTENTS OF A DIRECTORY.
contents = os.listdir(",")
print("Directory contents: {}",contents)
#DIRECTORY TRAVERSAL.
for root, dirs, files in os.walk("."):
    print("Root directory: {}",root)
    print("Directories: {}",dirs)