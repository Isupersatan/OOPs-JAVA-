//Inheritance - Parent-Child Relationship: What it means-> Children get properties/methods from parents.
class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {

    String breed;

    public Dog(String name, String breed) {
        super(name);//call the parent contructor
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class inhrtncExample {

    public static void main(String[] args) {
        Animal myAnimal = new Animal("Creature");
        System.out.println("Name: "+myAnimal.name);
        myAnimal.eat();
        myAnimal.sleep();
       // myAnimal.bark();//// ERROR - Animal doesn't have bark() method
       System.out.println(" ");

        Dog myDog = new Dog("Gudu", "street");
        System.out.println("Name: "+myDog.name);
        System.out.println("Breed: "+myDog.breed);
        myDog.bark();
        myDog.eat();
        myDog.sleep();

    }
}
