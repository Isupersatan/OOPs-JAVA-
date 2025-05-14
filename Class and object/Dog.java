//java program to demonstrate the class and object

//class declaration
public class Dog{

    //Instace Variables 
    String name;
    String breed;
    int age;
    String color;

    //constructor declaration of class
    public Dog(String name, String breed, int age , String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    //method 1
    public String getName(){
        return name;
    }

    //method 2
    public String getBreed(){
        return breed;
    }

    //method3
    public int getAge(){
        return age;
    }

    //method 4
    public String getColor(){
        return color;
    }

    
    @Override public String toString(){
        return "Dog name: "+ this.getName()+"\n breed , age , color are "
        + this.getBreed()+", "+this.getAge()+" , "+this.getColor();
    }

    public static void main(String[] args) {
        //object creation
        Dog tuffy = new Dog("Tuffy","Street",5,"Off White");
        System.out.print(tuffy.toString());
    }
}

/* Explanation: Here, the above program demonstrate a class Dog with some instance variables. The constructor is used to initializes value to these variables. The toString() method is used to provide a string representation of the dog object. In the main method, a Dog object named tuffy is created with specific values and its details are printed using the toString() method.

This class contains a single constructor. We can recognize a constructor because its declaration uses the same name as the class and it has no return type. The Java compiler differentiates the constructors based on the number and the type of the arguments. The constructor in the Dog class takes four arguments. The following statement provides “tuffy”, “papillon”,5, and “white” as values for those arguments:

Dog tuffy = new Dog("Tuffy","Street",5,"Off White"); */