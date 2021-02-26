kcpe_mark = int(input("input student kcpe mark:"))
if kcpe_mark >=400 and kcpe_mark <=500:
    print("You qualify to join National school")
elif kcpe_mark >= 300 and kcpe_mark <400:
    print("You qualify to join extra county school")
elif kcpe_mark >= 200 and kcpe_mark < 300:
    print("You qualify to join county school")
elif kcpe_mark>=0 and kcpe_mark<200:
    print("You qualify to join local school")
else:
    print("input valid marks")