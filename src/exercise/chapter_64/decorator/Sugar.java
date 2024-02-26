package exercise.chapter_64.decorator;

public class Sugar extends BeverageDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }

    @Override
    public double cost() {
        return super.cost() + 0.3;
    }
}
