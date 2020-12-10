#lists and tuples-arrays
#lists-mutable, dynamic, orders
x = ["Peter", 250, "Toyota", 32.5]
x[0] = "Sharon"#change the list by position-mutable
print(type(x))
print("My list has", x)
print(x[0:2])#access by index
print("The last value is",x[-1])#access from the last location
#tuples-immutable
y = ("Modcom", 200, 6, "Westlands")
# y[0]="Nairobi"#immutable cannot be changed
print(type(y))
print("My tuple has", y)
print(y[2:4])#access by index