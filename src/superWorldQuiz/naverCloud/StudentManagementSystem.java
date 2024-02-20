package superWorldQuiz.naverCloud;

import java.util.ArrayList;

public class StudentManagementSystem {
    ArrayList<Student> students;
    int studentNum;

    public StudentManagementSystem(int studentNum) {
        this.studentNum = studentNum;
        students = new ArrayList<>(studentNum);
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.printf("학생 추가: %s\n", student.getName());
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentCode() == student.getStudentCode()) {
                System.out.printf("학생 삭제: %s\n", students.remove(i).getName());
                break;
            }
        }
    }

    public void searchStudent(int studentCode) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentCode() == studentCode) {
                System.out.printf("학생을 찾았습니다:\n" +
                                "이름: %S\n" +
                                "학번: %d\n" +
                                "전공: %s\n" +
                                "학년: %d\n",
                        students.get(i).getName(),
                        students.get(i).getStudentCode(),
                        students.get(i).getMajor(),
                        students.get(i).getStudentYear()
                );
                break;
            } else {
                System.out.println("학생을 찾을 수 없습니다.\n");
            }
        }
    }
}
