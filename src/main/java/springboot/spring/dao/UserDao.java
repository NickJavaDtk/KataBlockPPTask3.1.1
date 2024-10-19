package springboot.spring.dao;

import springboot.spring.model.User;

import java.util.List;

public interface UserDao {
    User getUser(Long id);
    void addUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
    List<User> getUserList();
}
