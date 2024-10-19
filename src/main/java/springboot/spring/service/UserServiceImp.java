package springboot.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.spring.dao.UserDao;
import springboot.spring.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {
    private UserDao dao;

    public UserServiceImp(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public User getUser(String id) {
        if(checkLongValue(id)) {
            return dao.getUser(Long.parseLong(id));
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }

    @Override
    public void updateUser(String id, User user) {
        if (checkLongValue(id)) {
            dao.updateUser(Long.parseLong(id), user);
        }
    }

    @Override
    public void deleteUser(String id) {
       if (checkLongValue(id)) {
           dao.deleteUser(Long.parseLong(id));
       }
    }

    @Override
    public List<User> getUserList() {
        return dao.getUserList();
    }

    private boolean checkLongValue(String longValue) {
        long idTmp = 0L;
        try {
            idTmp = Long.parseLong(longValue);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return idTmp != 0;
    }
}
