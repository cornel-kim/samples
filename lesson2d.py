def whileLoop():
    x = 0
    while x < 100:
        print(x)
        x+=10


whileLoop()


def marks():
     stdntMarks = int(input("Please input student marks"))
     while stdntMarks < 500:
         print("Student marks", stdntMarks)
         if stdntMarks > 250:
             print("You are above average")
         else:
             print("You are below average")

         stdntMarks+=1

marks()