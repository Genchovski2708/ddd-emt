package mk.ukim.finki.emt.user.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Email {
    private final String email;

    public Email() {
        email = "";
    }

    public Email(String email) {
        this.email = email;
    }
}
