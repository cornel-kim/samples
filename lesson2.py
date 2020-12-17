#tuples, lists, and Dictionariorie
#loops while and for loop
#Python Function
#Arrays-object are enclosed in the square bracktes[] or brackets()
#Lists-ordered(indexed), mutable(can be changed), dynamic

list1 = ["Peter", 4000, 32.5, "Kenya"]
print(type(list1))
print(list1)#access all the items of the list
print(list1[0])#access the first item of the array or list
print(list1[3])#access the last item of list1 by order
print(list1[-1])#accessing item from last
print(list1[:])#access all items of the list
print(list1[:2])#access index 0 and 1
print("Accessing items from index 1", list1[2:])#access items from index 1 to the last
print(list1[2:3])#access item in-between index 2 and 3
list1[3] = 23#the list is changed by position hence mutable
print("Item added", list1)
#accessing items by index is refered to as slicing
#a tuple is-immutable, index()

tuple1 = ("Nairobi", 47, "nairobi@go.ke", "Mbuvi", "NMS")
print(type(tuple1))
print(tuple1)#acces all items of the tuple
print(tuple1[:])#access all items of the tuple
print(tuple1[-1])#access the last items
# tuple1[2] = "Nakuru"
# print("get items of changed tuple", tuple1) you cant change items of a tuple
