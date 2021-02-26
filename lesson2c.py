student_marks = int(input("Input student marks:"))
#if else statement, elif
if student_marks >= 70 and student_marks <= 100:
    print("You score A")
elif student_marks >= 60 and student_marks < 70:
    print("You scored a B")
elif student_marks >= 50 and student_marks < 60:
    print("You scored a C")
elif student_marks >= 40 and student_marks < 50:
    print("You scored  D")
elif student_marks >=0 and student_marks < 40:
    print("You scored E")
else:
    print("input valid mark")
#Using the same concept, take student kcpe marks and award them respective schools.
#i.e 400-500 marks(national schools), 300-400(extra county), 200-300(county), 0-200(local schools)