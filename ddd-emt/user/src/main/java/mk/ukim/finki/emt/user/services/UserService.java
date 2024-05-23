package mk.ukim.finki.emt.user.services;

import mk.ukim.finki.emt.user.domain.models.User;
import mk.ukim.finki.emt.user.domain.models.UserId;
import mk.ukim.finki.emt.user.services.form.UserForm;

import java.util.List;

public interface UserService {
    User findById(UserId id);
    List<User> findAll();
    User createUser(UserForm userForm);
}
