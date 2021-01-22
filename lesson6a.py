# def marks(eng, kisw, math):
#     total = eng + kisw + math
#     return total
#
#
# print(marks(eng=30, kisw=50, math=34))
#get prime numbers using return statement

def primenumber(n):
    if n > 1:
        for x in range(2, n):
            if n % x == 0:
                print(n, "is not a prime number")
                break
        else:
            print(n, "is a prime number")
    else:
        print(n, "is not a prime number")


print(primenumber(13))
#bmi question
#employee payments with gross income, deductionc(paye)

