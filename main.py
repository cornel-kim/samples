#pin, balance, amount
atm_pin = int(input("Please input your ATM pin:"))
if atm_pin == 4000:
    print("Pin successful, proceed to withdraw")
    balance = 10000
    if balance <= 10000:
        withdrawal_amount = int(input("Enter the amount to withdraw:"))
        print("Withdrawal is successful")
    else:
        print("The account balance is not sufficient, try a smaller amount")
else:
    print("Invalid pin, try again")