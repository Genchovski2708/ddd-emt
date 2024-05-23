package mk.ukim.finki.emt.order.domain.model;

import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class BookingId extends DomainObjectId {
    private BookingId(){
        super(BookingId.randomId(BookingId.class).getId());
    }
    public BookingId(@NonNull String uuid) {
        super(uuid);
    }
}
