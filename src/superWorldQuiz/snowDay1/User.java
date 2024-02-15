package superWorldQuiz.snowDay1;

public abstract class User{

    protected String username;

    public User(String username) {
        this.username = username;
    }

    public void order() {
        System.out.printf("유저(%s)은 주문을 할 수 있습니다.\n", username);
    }

    public void payment() {
        System.out.printf("유저(%s)은 결제을 할 수 있습니다.\n", username);
    }


    public void writeReview() {
        System.out.println("ReviewRole 을 맡아서 리뷰를 작성할 수 있습니다.");
    }

    public void giveRating() {
        System.out.println("ReviewRole 을 맡아서 점수를 평가할 수 있습니다.");
    }

    public void manageUsers() {
        System.out.printf("슈퍼유저(%s)은 유저를 매니징할 수 있습니다.\n", username);
    }

    public void changeSettings() {
        System.out.printf("슈퍼유저(%s)은 세팅을 변경할 수 있습니다.\n", username);
    }
}
