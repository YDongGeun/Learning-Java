package superWorldQuiz.snowDay3.answer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ClassRoom<T extends CollegeStudent> {
    private String className;
    private Map<String, T> studentMap;
    private List<String> studentNames;

    public ClassRoom(String className) {
        this.className = className;
        studentMap = new HashMap<>();
        studentNames = new ArrayList<>();
    }

    public void addStudent(T student) {
        studentMap.put(student.getStudentNumber(), student);
        studentNames.add(student.getName());
    }

    public T getStudentByStudentNumber(String studentNumber) {
        return studentMap.get(studentNumber);
    }

    public void printStudentNames() {
        StringBuilder sb = new StringBuilder();
        for (String name : studentNames) {
            sb.append(",").append(name);
        }
        System.out.println("이 클래스 룸(" + this.className + ")은 학생들 [" + sb.deleteCharAt(0) + "]가 있습니다.");
    }
}
