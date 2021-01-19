# number = 0#base value
# while number < 10000:
#     print(number)
#     number = number + 1
#     if number < 9:
#         continue
#     else:
#         break
#
# list = ["orange", "mangoes", "peas", "passion"]
# for fruit in list:
#     print(fruit)
#     if fruit == "mangoes":
#         break
#     else:
#         continue

#check password
count = 0
while count < 4:
    password = str(input("Input password:"))
    if password == '12345':
        print('access granted')
        break

    else:
        print('access denied')
        count +=1
