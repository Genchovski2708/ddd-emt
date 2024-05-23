package mk.ukim.finki.emt.user.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Username {
    private final String username;

    public Username() {
        username = "";
    }

    public Username(String username) {
        this.username = username;
    }
}
