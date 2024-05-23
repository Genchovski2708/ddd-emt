package mk.ukim.finki.emt.order.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Getter
public class User implements ValueObject {
    private final UserId id;

    public User() {
        this.id = new UserId();
    }

    @JsonCreator
    public User(UserId id, int bookedSeats) {
        this.id = id;
    }
}
