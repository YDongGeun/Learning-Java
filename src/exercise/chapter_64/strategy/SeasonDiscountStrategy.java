package exercise.chapter_64.strategy;

public class SeasonDiscountStrategy implements DiscountStrategy{
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.1;
    }
}
