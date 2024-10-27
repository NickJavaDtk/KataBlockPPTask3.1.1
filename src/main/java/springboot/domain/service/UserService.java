package springboot.domain.service;


import springboot.domain.model.User;

import java.util.List;


public interface UserService {
    User getUser(String id);

    void addUser(User user);

    void updateUser(String id, User user);

    void deleteUser(String id);

    List<User> getUserList();
}
