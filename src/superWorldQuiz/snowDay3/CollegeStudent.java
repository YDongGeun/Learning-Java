package superWorldQuiz.snowDay3;

abstract class Student {
    protected String studentNumber;
    protected String name;
    protected double grade;

    Student(String number, String name, double grade) {
        this.studentNumber = number;
        this.name = name;
        this.grade = grade;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public String toString() {
        return getName();
    }
}

abstract class CollegeStudent extends Student{
    CollegeStudent(String number, String name, double grade) {
        super(number, name, grade);
    }
}

abstract class ElderGroupCollegeStudent extends CollegeStudent {

    ElderGroupCollegeStudent(String number, String name, double grade) {
        super(number, name, grade);
    }
}

abstract class YoungGroupCollegeStudent extends CollegeStudent {

    YoungGroupCollegeStudent(String number, String name, double grade) {
        super(number, name, grade);
    }
}

class Freshman extends YoungGroupCollegeStudent {

    public Freshman(String number, String name, double grade) {
        super(number, name, grade);
    }

}

class Junior extends YoungGroupCollegeStudent {

    public Junior(String number, String name, double grade) {
        super(number, name, grade);
    }
}

class Senior extends ElderGroupCollegeStudent {

    public Senior(String number, String name, double grade) {
        super(number, name, grade);
    }
}

class Sophomore extends ElderGroupCollegeStudent {

    public Sophomore(String number, String name, double grade) {
        super(number, name, grade);
    }
}
