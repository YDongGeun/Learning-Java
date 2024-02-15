package superWorldQuiz.snowDay1;

public class UserManageSystem {

    /**
     * 유저(김지민)은 주문을 할 수 있습니다.
     * 유저(김지민)은 결제를 할 수 있습니다.
     * 유저(이승우)은 주문을 할 수 있습니다.
     * 유저(이승우)은 결제를 할 수 있습니다.
     * 유저(박현주)은 주문을 할 수 있습니다.
     * 유저(박현주)은 결제를 할 수 있습니다.
     * 유저(정민재)은 주문을 할 수 있습니다.
     * 유저(정민재)은 결제를 할 수 있습니다.
     * ReviewRole을 맡아서 리뷰 작성할 수 있습니다.
     * ReviewRole을 맡아서 점수 평가할 수 있습니다.
     * 유저(강지현)은 주문을 할 수 있습니다.
     * 유저(강지현)은 결제를 할 수 있습니다.
     * ReviewRole을 맡아서 리뷰 작성할 수 있습니다.
     * ReviewRole을 맡아서 점수 평가할 수 있습니다.
     * 유저(임서연)은 주문을 할 수 있습니다.
     * 유저(임서연)은 결제를 할 수 있습니다.
     * ReviewRole을 맡아서 리뷰 작성할 수 있습니다.
     * ReviewRole을 맡아서 점수 평가할 수 있습니다.
     * 슈퍼유저(임서연)은 유저를 매니징 할 수 있습니다.
     * 슈퍼유저(임서연)은 세팅을 변경할 수 있습니다.
     * @param args
     */
    public static void main(String[] args){

        User[] users = new User[]{
                new GeneralUser("김지민"), new GeneralUser("이승우"), new GeneralUser("박현주"),
                new ReviewerUser("정민재"), new ReviewerUser("강지현"),
                new SuperUser("임서연"), new SuperUser("한민수")
        };

        for(User user: users){
            if (user instanceof CustomerRole){
                ((CustomerRole) user).order();
                ((CustomerRole) user).payment();
            }

            if (user instanceof ReviewerRole){
                ((ReviewerRole) user).writeReview();
                ((ReviewerRole) user).giveRating();
            }

            if (user instanceof AdminRole){
                ((AdminRole) user).manageUsers();
                ((AdminRole) user).changeSettings();
            }
        }
    }

}
