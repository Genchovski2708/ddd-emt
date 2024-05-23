package mk.ukim.finki.emt.order.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.NonNull;
import mk.ukim.finki.emt.order.domain.model.BookingId;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

@Embeddable
public class RideId extends DomainObjectId {
    public RideId() {
        super(RideId.randomId(RideId.class).getId());
    }

    public RideId(@NonNull String uuid) {
        super(uuid);
    }
}
