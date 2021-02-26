#check for covid signs
temperature = float(input("Input temperature:"))
symptom = str(input("Input symptom:"))
if temperature > 37.2 or symptom == "cough":
    print("You might have corona")
elif temperature > 37.2 and symptom == "cough":
    print("Please admit the patient")
elif temperature < 37.2 and symptom !="cough":
    print("You are free from infection, keep safe")
else:
    print("You are good to go")

 #using changing conditions, people do wear warm clothing when it is raining or cold.
 #create a simple program to check for condition