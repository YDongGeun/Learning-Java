package superWorldQuiz.snowDay1;

public class GeneralUser extends User implements CustomerRole{
    public GeneralUser(String username) {
        super(username);
    }

    public void order() {
        super.order();
    }

    public void payment() {
        super.payment();
    }
}
