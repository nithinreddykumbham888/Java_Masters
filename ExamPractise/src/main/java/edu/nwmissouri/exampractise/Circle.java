package edu.nwmissouri.exampractise;

public class Circle extends Shape {

    // private attribute
    double radius;

    // constructor
    public Circle(String shapeType,double radiusIn) {
        super(shapeType);
        this.radius = radiusIn;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // add an executable main() method to test it
    public static void main(String[] args){
        double r = 1.0;
        Circle c = new Circle("Circle",r);

        String type = c.getShapeType();
        double area = c.getArea();
        double perimeter = c.getPerimeter();

        System.out.println("Type : "+type);
        System.out.println("===========================================");
        System.out.println("Circle");
        System.out.println("===========================================");
        System.out.println("Given radius: " + r);
        System.out.println("A circle's area will be " + area);
        System.out.println("A circle's perimeter will be " + perimeter);
        System.out.println("===========================================");
    }

}
   
