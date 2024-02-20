package superWorldQuiz.naverCloud;

class Circle extends Shape {
    private static final double PI=3.14;
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateDiameter() {
        return 2 * radius;
    }

    public double calculatePerimeter() {
        return Math.round(2 * PI * radius);
    }

    public void printCircleInfo() {
        super.printInfo();
        System.out.println("원의 반지름: " + radius);
    }
}