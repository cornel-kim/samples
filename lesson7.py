#class-group of related objects
#object-a member/instance/individual of class(single member)
# -attributes(behavior or properties)- name, age, vertices
#methods(example jave, getters(get+) and setters(set+))-access instances of a class
#example class cars: its method is cars()
#Inheritance, encapsulation(private static, public and protected), polymorphism

class animal:
    def __init__(self, name):#self will reinitialize attributes to the class
        self.name = name

      #instances of a class-descption, speech

    def mammal(self, sound):
        cover = "fur"

        print(self.name, " has", cover, "and", sound)

    def birds(self):
        cover1 = "feathers"
        sing = "parrot sings jingle bells"
        print(self.name, " has", cover1, "and", sing)


#create the objects
object0 = animal("mammal")
object0.mammal("Humans speak in various languages")
object1 = animal("bird")
object1.birds()