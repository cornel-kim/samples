# def highschool():
#     marks = int(input("Input your marks"))
#     if marks < 0:
#         print("marks cant be less than 0")
#     elif marks > 500:
#         print("marks cant be more than 500")
#     elif marks >=400 and marks <=500:
#         print("You are qualified to join a national school")
#     else:
#         print("No marks added")
# #1
# #2
# highschool()
#arguments, parameters, and use return statement
from lesson6 import bank
banking = bank(balance=10000,amount_with=1000,amount_dep=0)
# print(banking)
print(banking)
if banking > 1000:
    print("You earn an interest of 20% p.a")
else:
    print("no discount")