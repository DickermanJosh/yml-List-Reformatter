# yml-List-Reformatter
 This is a very simple project made to reformat large lists of text by adding "  - " before every line. 
 I created this script to avoid having to manually add a hyphen and the proper spacing before 
 every element of a list that needed to be be added to a YML file.

# A

# B
 
# C
 
	Becomes ->

#  - A
  
#  - B

#  - C

There will also be an extra two spaces added before each hyphen in addition to the hyphen itself and the space between the hyphen and the rest of the line
  
# USAGE:
- Clone this project or copy the contents of Reformatter.java into your own project
- Locate the project directory in cmd or terminal, compile with "javac Reformatter.java" then run using "java Reformatter"
- After compiling the script in a terminal or command window, enter the content root path of the file 
  you wish to reformat when prompted
- Your reformatted file will be updated as ReformattedList.txt, your original file will not be altered in any way
