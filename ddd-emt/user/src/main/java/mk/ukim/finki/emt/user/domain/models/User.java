package mk.ukim.finki.emt.user.domain.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.user.domain.valueobjects.Email;
import mk.ukim.finki.emt.user.domain.valueobjects.Password;
import mk.ukim.finki.emt.user.domain.valueobjects.Username;

@Entity
@Table(name = "app_user")
@Getter
public class User extends AbstractEntity<UserId> {
    @Column(name = "username")
    private Username username;

    @Column(name = "password")
    private Password password;

    @Column(name = "email")
    private Email email;

    public User() {
        super(UserId.randomId(UserId.class));
    }

    public static User build(Username username, Password password, Email email) {
        User user = new User();
        user.email = email;
        user.username = username;
        user.password = password;
        return user;
    }
}
