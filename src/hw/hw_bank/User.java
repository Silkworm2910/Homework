package hw.hw_bank;

public class User {
    private int id;
    private String email;
    private static int idGen = 0;

    public User(String email) {
        this.email = email;
        this.id = ++idGen;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
