package exercise.chapter_53.learn_Enum;

import exercise.chapter_52.exception.IDFormatException;

public class PTMemberTest {
    public static void main(String[] args) {
        PTMember member = new PTMember("민철", 172, 70, "Male");

        try {
            member.setID("111111111");
        } catch (IDFormatException e) {
            // 고객에게 알람 보내기
            e.printStackTrace();
        }
        System.out.println(member);

    }


}
