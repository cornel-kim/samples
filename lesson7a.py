#create a bank account
#name, accno, age, phone number, fee, balanace
class Account:
    def __init__(self, name, accno, age, phone, fee, balance):
        self.name = name
        self.accno = accno
        self.age = age
        self.phone = phone
        self.fee = fee
        self.balance = balance

    def deposit(self, amnt_deposited):
        self.balance = amnt_deposited + self.balance
        print('Your account balance is:', self.balance)

    def withdraw(self, amnt_withdrawn):
        self.balance = self.balance - amnt_withdrawn
        self.fee = 23
        print("You made a withdrawal of amount:", amnt_withdrawn)
        print("You new balance is", self.balance-self.fee)


myBank = Account('Brian', 12456, 24, '07543267',0, 2000)
myBank.deposit(amnt_deposited=5000)
myBank.withdraw(amnt_withdrawn=1000)