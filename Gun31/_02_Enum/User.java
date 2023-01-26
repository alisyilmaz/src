package Gun31._02_Enum;

public class User {
    String username;
    Role role;
    Statu statu;

    public User(String username, Role role, Statu statu) {
        this.username = username;
        this.role = role;
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}
