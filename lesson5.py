#function-stored and user declared(created)
#print-stored function, sqrt, square, sum
#advantages- code re-use, user defined, easy troubleshooting,
# leads to OOP
def user():
    print("user one")


user()

import lesson6
def score():#declare a function
    math = 20
    eng = 40
    kisw = 50
    total = math + eng + kisw
    print("your total score is", total)


score()#calling/invoking a function
lesson6.sum1(a=40, b=23)