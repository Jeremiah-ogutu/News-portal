package dao;

import models.User;

import java.util.List;

public interface UserDao {

    void  addUser(User user);
    List<User>getAllUser();
    List<User>getUserById(int id);


    void deleteById(int id);
    void clearAll();
}
