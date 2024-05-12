package inkaps.task2;
/*Создайте класс User, который инкапсулирует данные пользователя:
логин, пароль и email. Обеспечьте безопасное изменение и доступ к
этим полям через геттеры и сеттеры. Пароль должен изменяться только
если старый пароль введен верно и новый пароль соответствует
определенным требованиям безопасности.
 */

public class User {
    private String login;
    private String password;
    private String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword) && isNewPasswordSecure(newPassword)) {
            this.password = newPassword;
        } else {
            System.out.println("Incorrect old password or new password does not meet security requirements.");
        }
    }

    private boolean isNewPasswordSecure(String newPassword) {
        // Add your security requirements for the new password here
        return newPassword.length() >= 8; // For example, require at least 8 characters
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        User user = new User("username", "password123", "user@example.com");

        System.out.println("Current password: " + user.getPassword());
        user.setPassword("password123", "newpassword456"); // should not change
        user.setPassword("password123", "newpass"); // should not change
        user.setPassword("password123", "newsecurepassword"); // should change

        System.out.println("New password: " + user.getPassword());
    }
}