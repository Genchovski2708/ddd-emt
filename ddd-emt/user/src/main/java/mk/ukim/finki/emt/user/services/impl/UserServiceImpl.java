package mk.ukim.finki.emt.user.services.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

import mk.ukim.finki.emt.user.domain.models.User;
import mk.ukim.finki.emt.user.domain.exceptions.UserNotFoundException;
import mk.ukim.finki.emt.user.domain.models.UserId;
import mk.ukim.finki.emt.user.domain.repository.UserRepository;
import mk.ukim.finki.emt.user.services.UserService;
import mk.ukim.finki.emt.user.services.form.UserForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User findById(UserId id) {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(UserForm userForm) {
        User u = User.build(userForm.getUsername(),userForm.getPassword(),userForm.getEmail());
        userRepository.save(u);
        return u;
    }
}
