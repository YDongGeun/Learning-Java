package superWorldQuiz.snowDay3;

import java.util.HashMap;
import java.util.Map;

class ClassRoom<S extends Student> {
    private String className;
    private S s;
    private String sName;
    Map<String, Student> student = new HashMap<>();

    public ClassRoom(String className) {
        this.className = className;
    }

    public void addStudent(Student student) {
        this.student.put(student.getStudentNumber(), student);
        this.s = (S) student;
        sName = s.getClass().getName();
    }

    public String toString(String num) {
        sName = sName.replace("superWorldQuiz.snowDay3.", "");
        return sName + String.format("{" +
                        "studentNumber = '%s', name = '%s', gpa = %.1f" +
                        "}",
                student.get(num).getStudentNumber(),
                student.get(num).getName(),
                student.get(num).getGrade());
    }

    public void printStudentNames() {
        System.out.println("이 클래스 룸(" + className + ")은 학생들 " + student.values() + "가 있습니다.");
    }

    public String getStudentByStudentNumber(String number) {
        if (student.get(number) == null) {
            return null;
        }else {
            return toString(number);
        }
    }
}

