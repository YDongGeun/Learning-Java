package superWorldQuiz;

class Circle extends Shape {
    private static final double PI=3.14;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public void printCircleInfo() {
        super.printInfo();
        System.out.println("원의 반지름: " + radius);
    }
}