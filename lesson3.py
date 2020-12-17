#functions-reusability, proper organisation, brings about object oriented programming.

def my_function():
    print("Python functions")


#call a function, trigger
my_function()#function call, trigger or return


def perfromance():
    math = 50
    english = 60
    kiswahili = 40
    sum_performance = math + english + kiswahili
    print("The student marks is", sum_performance)


perfromance()


def BMI():
    weight = float(input("Please input your weight:"))
    height = float(input("Please input your height:"))
    BMI_CALC = weight/height
    if BMI_CALC > 35:
        print("You are obesse")
    elif BMI_CALC>20 and BMI_CALC<=35:
        print("You are overweight")
    elif BMI_CALC > 10 and BMI_CALC <=20:
        print("You are on average weight")
    elif BMI_CALC > 0 and BMI_CALC  <= 10:
        print("You are under weight")
    else:
        print("Input valid figures")


BMI()

















