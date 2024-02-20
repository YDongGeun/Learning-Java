package superWorldQuiz.naverCloud;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public double calculateDiagonal() {
        return Math.round(Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));
    }

    public void printRectangleInfo() {
        super.printInfo();
        System.out.println("사각형의 가로 길이: " + width);
        System.out.println("사각형의 세로 길이: " + height);
    }
}
