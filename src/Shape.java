 interface Shape {
    double calculatePerimeter();


    double calculateArea();


    default void printCharacteristics(String fillColor, String borderColor) {
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
    }
}
class Circle implements Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle implements Shape {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }


    @Override
    public double calculateArea() {
        return length * width;
    }
}


class Triangle implements Shape {
    private double a, b, c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }


    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}


