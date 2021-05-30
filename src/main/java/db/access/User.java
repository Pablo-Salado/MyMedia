package db.access;

import java.sql.Date;

public class User {
    private  String username;
    private  String email;
    private  String password;
    private  Boolean role;
    private java.sql.Date age;

    public User(String username,String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = null;
        role = false;
    }

    public User(String username, String email, String password, java.sql.Date age){
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        role = false;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getRole() {
        return role;
    }

    public Date getAge() {
        return age;
    }
}
