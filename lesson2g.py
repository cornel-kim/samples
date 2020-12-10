#payroll
def payroll(basic, allowance):
    print("Your basic salary is ", basic)
    print("Your allowances are", allowance)
    gross = basic + allowance
    # print("Your gross income is ", gross)
    return gross



returned_gross = payroll(basic=4000, allowance=2000)
print("Your gross salary is", returned_gross)
