package crud.dao;

import crud.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    User getById(long id);

    List<User> getAllUsers();

    void updateUser(User user);

    void deleteUser(long id);

}
