package mk.ukim.finki.emt.user.services.form;

import lombok.Data;
import mk.ukim.finki.emt.user.domain.valueobjects.Email;
import mk.ukim.finki.emt.user.domain.valueobjects.Password;
import mk.ukim.finki.emt.user.domain.valueobjects.Username;

@Data
public class UserForm {
    Username username;
    Email email;
    Password password;
}
