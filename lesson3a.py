#tuples- (), it is immutable
student_score = (60, 67, 75, 87, 80, 32, 24)
print(student_score)
print(type(student_score))
#you access items by index position
student_score_list = list(student_score)#convert tuple to list
print(student_score_list)
student_score_list.remove(60)#remove item by name and not position
print(student_score_list)
student_score_list1 = tuple(student_score_list)
print(student_score_list1)#converts a list to tuple after change