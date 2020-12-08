#if else statement with elif
Marks_grading = int(input("Please input student marks"))
if Marks_grading < 0:
    print("Please input valid marks")
elif Marks_grading >= 0 and Marks_grading <30:
    print("You scored an E")
elif Marks_grading >=30 and Marks_grading <45:
    print("You scored a D")
elif Marks_grading>=45 and Marks_grading < 60:
    print("You scored a C")
elif Marks_grading >=60 and Marks_grading <75:
    print("You scored a B")
elif Marks_grading >=75 and Marks_grading <=100:
    print("You scored an A")
else:
    print("Values not found")