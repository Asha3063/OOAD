
    //lab 5
package lab5;

abstract class Shape {

    double dim1, dim2;

    Shape(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    abstract void area();

}

class Rectangle extends Shape {

    Rectangle(double d1, double d2) {
        super(d1, d2);
    }

    void area() {
        double a = dim1 * dim2;
        System.out.println("Area of rectangle:" + a);
    }
}

class Triangle extends Shape {

    Triangle(double d1, double d2) {
        super(d1, d2);
    }

    void area() {
        double a = 0.5 * dim1 * dim2;
        System.out.println("Area of triangle:" + a);
    }
}

public class Abstraction {

  
    }



    
    

