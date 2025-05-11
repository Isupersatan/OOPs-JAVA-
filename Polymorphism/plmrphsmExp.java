// Polymorphism - Many Forms
// What it means: Same method behaves differently in different contexts.

class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
    void clcltArea(double radius){
        System.out.println("area of circle is:"+ Math.PI*radius*radius);
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}
public class plmrphsmExp{
    public static void main(String[] args) {
        Shape []shapes = new Shape[3];
        shapes[0] = new Shape();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();

        for(Shape shape : shapes){
            shape.draw();// same method different result
        }

        Shape myShape = new Circle();
        myShape.draw();// call Circle's Draw

        //myShape.clcltArea(5);// ERROR : myShape doesnt know about clcltArea() method

        if(myShape instanceof Circle){
            ((Circle)myShape).clcltArea(5); //safe to call after checking
        }
    }
}