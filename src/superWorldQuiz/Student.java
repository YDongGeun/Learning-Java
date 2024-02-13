package superWorldQuiz;

public class Student {
   private String name;
   private int studentCode;
   private String major;
   private int StudentYear;

   public Student(String name, int studentCode, String major, int studentYear) {
       this.name = name;
       this.studentCode = studentCode;
       this.major = major;
       this.StudentYear = studentYear;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getStudentYear() {
        return StudentYear;
    }

    public void setStudentYear(int studentYear) {
        StudentYear = studentYear;
    }
}
