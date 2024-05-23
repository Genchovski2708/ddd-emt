package mk.ukim.finki.emt.order.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

@Embeddable
public class UserId extends DomainObjectId {
    public UserId(@NonNull String uuid) {
        super(uuid);
    }

    public UserId() {
        super(UserId.randomId(UserId.class).getId());
    }
}
