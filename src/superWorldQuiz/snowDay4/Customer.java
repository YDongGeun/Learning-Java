package superWorldQuiz.snowDay4;

public class Customer {
    private String name;
    private int age;
    private Gender gender;

    public String getName() {
        return name;
    }

    public Customer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = Gender.valueOfTerm(gender);
    }

    @Override
    public String toString() {
        return "Customer{" + name + '}';
    }
}
