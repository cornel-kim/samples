# # arguments and parameters
# def sum1(a: int, b: int):  # parameters
#     # a = 10
#     # b = 2
#     c = a + b
#     print(c)
#
#
# sum1(a=10, b=3)  # arguments


def bank(balance:int, amount_dep:int, amount_with:int):#parameters
    total_balance = (amount_dep + balance) - amount_with
    print("The total balance is",total_balance)
    print("amount deposited is", amount_dep )
    print("amount withdrawn is",amount_with)
    print("initial balance is", balance)
    return total_balance


bank(balance=2000, amount_dep=4000, amount_with=6000)#argumets
bank(balance=5000, amount_dep=0, amount_with=200)

