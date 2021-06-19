package models;

import java.util.Objects;

public class User {
    private int id;
    private  String UserName;
    private  String  phone_no;
    private  String position;


    public User(String UserName, String phone, String position){
        this.UserName = UserName;
        this.phone_no = phone_no;
        this.position=position;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public String getPosition() {
        return position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id &&
                UserName.equals(user.UserName) &&
                phone_no.equals(user.phone_no) &&
                position.equals(user.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, UserName, phone_no, position);
    }
}
