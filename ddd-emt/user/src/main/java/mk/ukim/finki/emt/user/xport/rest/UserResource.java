package mk.ukim.finki.emt.user.xport.rest;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.user.domain.models.User;
import mk.ukim.finki.emt.user.domain.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserResource {
    private final UserRepository userRepository;
    @GetMapping
    List<User> getAll(){
        return userRepository.findAll();
    }

}


