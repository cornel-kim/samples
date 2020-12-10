#parameters, return, arguments, break and continue
def calculations(x, y):#parameters
    s = x + y
    print(s)


calculations(x=3, y=6)#arguments
calculations(x=1, y=4)


#using return stament

def totalMarks(math, english, kiswahili):
    return math + english + kiswahili


print("Your total marks is",totalMarks(math=50, english=35, kiswahili=78))


#using break and continue
def loopStmt():
    d = 4
    while d < 10:
        print(d)
        d +=1
        if d<5:
            break
        else:
            continue



loopStmt()
























