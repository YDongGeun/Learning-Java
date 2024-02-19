package superWorldQuiz.snowDay3.answer;

public abstract class CollegeStudent {
    protected String studentNumber;
    protected String name;
    protected double gpa;

    public CollegeStudent(String studentNumber, String name, double gpa) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "studentNumber='" + studentNumber +
                '\\' + ", name='" + name +
                '\\' + ", gpa=" + gpa +
                '}';
    }
}


abstract class ElderGroupCollegeStudent extends CollegeStudent {
    public ElderGroupCollegeStudent(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "ElderGroupCollegeStudent{" +
                "studentNumber='" + studentNumber +
                '\\' + ", name='" + name +
                '\\' + ", gpa=" + gpa +
                '}';
    }
}

class Freshman extends YoungGroupCollegeStudent {
    public Freshman(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return " Freshman{" +
                "studentNumber='" + studentNumber +
                '\\' + ", name='" + name +
                '\\' + ", gpa=" + gpa +
                '}';
    }
}

class Junior extends ElderGroupCollegeStudent {
    public Junior(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Junior{" +
                "studentNumber='" + studentNumber +
                '\\' + ", name='" + name +
                '\\' + ", gpa=" + gpa +
                '}';
    }

}

class Senior extends ElderGroupCollegeStudent {
    public Senior(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Senior{" +
                "studentNumber='" + studentNumber +
                '\\' + ", name='" + name +
                '\\' + ", gpa=" + gpa +
                '}';
    }
}

class Sophomore extends YoungGroupCollegeStudent {
    public Sophomore(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Sophomore{" +
                "studentNumber='" + studentNumber +
                '\\' + ", name='" + name +
                '\\' + ", gpa=" + gpa +
                '}';
    }
}

abstract class YoungGroupCollegeStudent extends CollegeStudent {
    public YoungGroupCollegeStudent(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "YoungGroupCollegeStudent{" +
                "studentNumber='" + studentNumber +
                '\\' + ", name='" + name +
                '\\' + ", gpa=" + gpa +
                '}';
    }
}
