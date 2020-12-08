#control statements
# if, else, if else, else if, elif
# marks = int(input("Input your marks:"))
# print("Your entered marks is:", marks)
# if marks >= 250:
#     print("Can Join a secondary Institution")
#
# else:
#     print("You did not attain the required minimum marks")

#nested if else stament

corona_test_temperature = float(input("Input the temeperature results:"))
if corona_test_temperature > 37.2:
    print("You have one sign of corona")
    corona_sign = str(input("Input Other symptom:"))
    if corona_sign == "cough":
        print("You have two symptoms related to corona")
        corona_sign1 = str(input("Input the second symptom"))
        if corona_sign1 == "fatigue":
            print("Confirmed case")
        else:
            print("Please do more tests")
    else:
        print("Do more tests to validate the results")
else:
    print("You do not have any signs of corona")