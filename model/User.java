package model;

public class User {
    private int userId;
    private String username;
    private String email;
    private String password;
    private UserType userType;
    
    public User(int userId, String username, String email, String password, UserType userType) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }
    public User(String username2, String password2, String email2, String phone) {
        //TODO Auto-generated constructor stub
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public UserType getUserType() {
        return userType;
    }
    public void setUserType(UserType userType) {
        this.userType = userType;
    } 

    
}

