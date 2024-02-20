package superWorldQuiz.snowDay4.answer;

public class Customer {
    private String name;
    private int age;
    private Gender gender;

    public Customer(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\\' +
                ", age=" + age +
                ", gender='" + gender + '\\' +
                '}';
    }
}