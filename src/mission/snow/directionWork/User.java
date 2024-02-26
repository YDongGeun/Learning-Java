package mission.snow.directionWork;

public class User {
    protected String userName;
    protected String role;

    public User() {}

    public User(String name) {
        this.userName = name;
        this.role = "user";
    }

    public String getUserName() {
        return userName;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
