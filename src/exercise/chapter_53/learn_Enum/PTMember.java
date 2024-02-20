package exercise.chapter_53.learn_Enum;

import exercise.chapter_52.exception.IDFormatException;
import exercise.chapter_52.exception.PositiveNumberException;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PTMember {
    private String ID;
    private String name;
    private Integer height;
    private Integer weight;
    private Gender gender;
    private LocalDateTime enrollTime;

    public PTMember(String name, Integer height, Integer weight, String gender) {
        if (height <= 0 || weight <= 0) {
            throw new PositiveNumberException("키와 몸무게는 0이하일 수 없습니다.");
        }
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = Gender.valueOfTerm(gender);
        this.enrollTime = LocalDateTime.now();
    }

    public void setID(String ID) {
        if (ID == null) throw new IDFormatException("ID는 Null이 될 수 없습니다.");
        if (ID.length() <= 8 || ID.length() > 20) throw new IDFormatException("ID는 8자 이상 20자 이하입니다.");

        this.ID = ID;
    }

    @Override
    public String toString() {
        return "PTMember{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                ", enrollTime=" + enrollTime +
                '}';
    }
}
