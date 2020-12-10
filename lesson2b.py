def marksSystem():
    mark = int(input("Please input your mark"))
    if mark < 0:
        print("input valid figures")
    elif 0<mark<=100:
        print("Please redo the unit")
    elif 100<mark<=200:
        print("Do a suplementary exam")
    elif 200<mark<=500:
        print("You are promoted")
    else:
        print("No marks found")


marksSystem()