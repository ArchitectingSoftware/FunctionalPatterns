interface Animal

class Dog : Animal
class Cat : Animal

object AnimalFactory{

    operator fun invoke(kind: String): Animal? = when (kind) {
        "dog" -> Dog()
        "cat" -> Cat()
        else ->  null
    }

}


val d = AnimalFactory("dog")
val c = AnimalFactory("cat")

print("Object d = ${d.toString()} and Object c = ${c.toString()}")

