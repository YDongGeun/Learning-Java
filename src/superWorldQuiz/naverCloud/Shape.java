package superWorldQuiz.naverCloud;

public abstract class Shape {

    protected int dimension;
    protected String color;

    Shape() {
        dimension = 2;
        color = "흰색";
    }

    public double getArea() {
        return 0.0;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getDimension() {
        return dimension;
    }

    protected void printInfo() {
        System.out.println("도형의 색상: " + color);
        System.out.println("도형의 면적: " + getArea());
    }
}

