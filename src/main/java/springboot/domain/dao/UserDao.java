package springboot.domain.dao;

import springboot.domain.model.User;

import java.util.List;

public interface UserDao {
    User getUser(Long id);
    void addUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
    List<User> getUserList();
}
