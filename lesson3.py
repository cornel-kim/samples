#lists, tuples ,set and dictionaries-data structures in form array
#list- use [], it is mutable, items are indexed

list1 = [34, 1, 4, 6, 7, 9, 1000, 300]
print(type(list1))
#accessing items
print(list1)
#slicing
print(list1[6])#slicing
print(list1[-1])#access the last item of the array
print(list1[1:6])#pick items in a range using index
print(list1[:7])#pick items from start to 7th position
print(list1[4:])#print item from a given index to last
#stored libraries
print(len(list1))#check the lenght
print(max(list1))#give maximum value in an array
print(min(list1))#give the minum value in an array
print(sum(list1))#gives sum of all items in an array
print(sorted(list1))#sort from the smallest to largest
name = "brian"
print(list(name))#convert other items to list

list2 = [500, 400, 250]
list3 = list1 + list2#add two lists
list1.extend(list2)#add list items
print(list1)

list1.append(list2)
print(list1)#add another list inside another list

list1.reverse()
print(list1)#print list in reverse, opposite of sort
list1.sort()
print(list1)
