package superWorldQuiz.snowDay1;

public class ReviewerUser extends User implements CustomerRole, ReviewerRole{
    public ReviewerUser(String username) {
        super(username);
    }

    @Override
    public void writeReview() {
        super.writeReview();
    }

    @Override
    public void giveRating() {
        super.giveRating();
    }

    public void order() {
        super.order();
    }

    public void payment() {
        super.payment();
    }
}