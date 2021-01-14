#dictionaries- uses key and value, unordered, does allow duplicates, {}, mutable
student = {
    "name": "John Paul",
    "tel": "072346777",
    "d.o.b": 1995,

    "class": "software dev"

}
print(student)#acces values
print(student.get("name"))#using get to print
print(len(student))#check length
student["class"] = "android app"#change items using key.
print(student)

student.update({"d.o.b": 2000})#update values
print(student)

student["admission"] = "modcom/1/2021"#adding a new item to a dictionary
print(student)

student.pop("admission")#to remove item from a dict
print(student)

# del student
# print(student)

# student.clear()#clear items
# print(student)
#Check on looping through list, tuples and dictionaries