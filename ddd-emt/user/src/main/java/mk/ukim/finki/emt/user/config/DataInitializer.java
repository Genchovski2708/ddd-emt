package mk.ukim.finki.emt.user.config;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.user.domain.models.User;
import mk.ukim.finki.emt.user.domain.repository.UserRepository;
import mk.ukim.finki.emt.user.domain.valueobjects.Email;
import mk.ukim.finki.emt.user.domain.valueobjects.Password;
import mk.ukim.finki.emt.user.domain.valueobjects.Username;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataInitializer {
    private final UserRepository userRepository;

    @PostConstruct
    public void initData(){
        User user1 = User.build(new Username("Andrej"), new Password("Test"), new Email("andrej@andrej.com"));
        User user2 = User.build(new Username("Andrej2"), new Password("Test2"), new Email("andrej2@andrej.com"));
        User user3 = User.build(new Username("Andrej3"), new Password("Test3"), new Email("andrej3@andrej.com"));
        if(userRepository.findAll().isEmpty()){
            userRepository.saveAll(Arrays.asList(user1,user2,user3));
        }
    }
}
