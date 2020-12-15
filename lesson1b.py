#control statements- if else, if else elif and nested if else
mark = int(input("Please input students marks:"))
if mark > 0 and mark < 101:
    print("You have added a valid mark")
else:
    print("Input a valid mark")



#nested if else statement
user_type = str(input("Please input your user type i. e Teacher or student:"))
if user_type =="student":
    print("Should do exam")
    fee = str(input("Check if fee is cleared:"))
    if fee == "cleared":
        print("All clear to do exams")
    else:
        print("You havent cleared you fee hence not eligible")
else:
    print("You are not a student")




#if else, elif
student_mark = 350
if student_mark>380 and student_mark<500:
    print("Student to Join national school")
elif student_mark>300 and student_mark<=380:
    print("Student to join extra county school")
elif student_mark>200 and student_mark<=300:
    print("Student to join County school")
elif student_mark > 0 and student_mark<=200:
    print("Student to join local school")
else:
    print("Please input valid mark")

#check control statements, using for loop and while loop
























