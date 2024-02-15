package superWorldQuiz.snowDay1;

public class SuperUser extends User implements AdminRole, CustomerRole, ReviewerRole{

    public SuperUser(String username) {
        super(username);
    }

    @Override
    public void manageUsers() {
        super.manageUsers();
    }

    @Override
    public void changeSettings() {
        super.changeSettings();
    }

    @Override
    public void order() {
        super.order();
    }

    @Override
    public void payment() {
        super.payment();
    }

    @Override
    public void writeReview() {
        super.writeReview();
    }
    @Override
    public void giveRating() {
        super.giveRating();
    }
}
