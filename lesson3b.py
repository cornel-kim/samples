#return statement in Python
def payroll(basic, allowance, deduction):
    print("Your basic salary is:", basic)
    print("You total allowance is:", allowance)
    print("Total deduction is :", deduction)
    gross = (basic + allowance) - deduction
    # print("You gross income is :", gross)
    return gross


gross_income_returned = payroll(basic=4000, allowance=6000, deduction=500)
print("The gross income is :", gross_income_returned)