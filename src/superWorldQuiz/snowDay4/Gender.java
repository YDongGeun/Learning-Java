package superWorldQuiz.snowDay4;

import java.util.Locale;

public enum Gender {
    FEMALE("FEMALE", "여자"),
    MALE("MALE", "남자"),
    UNKNOWN("Unknown", "미정");

    private String englishTerm;
    private String koreanTerm;

    Gender(String englishTerm, String koreanTerm) {
        this.englishTerm = englishTerm;
        this.koreanTerm = koreanTerm;
    }

    public static Gender valueOfTerm(String str) {
        String strToUpper = str.toUpperCase();
        for (Gender gender: values()) {
            if (strToUpper.equals(gender.englishTerm) || strToUpper.equals(gender.koreanTerm)) {
                return gender;
            }
        }
        return UNKNOWN;
    }
}
