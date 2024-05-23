package mk.ukim.finki.emt.user.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Password {
    private final String password;

    public Password() {
        password = "";
    }

    public Password(String password) {
        this.password = password;
    }
}
