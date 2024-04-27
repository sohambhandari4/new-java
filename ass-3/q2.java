abstract class Shape {
    abstract double calcArea();
    abstract double calcVolume();
}

class Sphere extends Shape {
    private double radius;
    public Sphere(double radius) { this.radius = radius; }
    @Override double calcArea() { return 4 * Math.PI * Math.pow(radius, 2); }
    @Override double calcVolume() { return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); }
}

class Cone extends Shape {
    private double radius, height;
    public Cone(double radius, double height) { this.radius = radius; this.height = height; }
    @Override double calcArea() { return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))); }
    @Override double calcVolume() { return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height; }
}

class Cylinder extends Shape {
    private double radius, height;
    public Cylinder(double radius, double height) { this.radius = radius; this.height = height; }
    @Override double calcArea() { return 2 * Math.PI * radius * (radius + height); }
    @Override double calcVolume() { return Math.PI * Math.pow(radius, 2) * height; }
}

class Box extends Shape {
    private double length, breadth, height;
    public Box(double length, double breadth, double height) { this.length = length; this.breadth = breadth; this.height = height; }
    @Override double calcArea() { return 2 * (length * breadth + breadth * height + height * length); }
    @Override double calcVolume() { return length * breadth * height; }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Sphere(5),
            new Cone(3, 4),
            new Cylinder(2, 6),
            new Box(3, 4, 5)
        };
        
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " Area: " + shape.calcArea());
            System.out.println(shape.getClass().getSimpleName() + " Volume: " + shape.calcVolume());
        }
    }
}
