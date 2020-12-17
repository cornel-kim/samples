#arguments and paramenters
def simple_interest(interest, amount, time):#interest, amount and time are parameters
    simpleInterest = (amount * interest * time)/100
    print("The simple interest is: ", simpleInterest)


simple_interest(interest=15, amount=2000, time=3)
simple_interest(interest=10, amount=10000, time=1)