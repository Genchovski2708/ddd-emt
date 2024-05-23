package mk.ukim.finki.emt.ride.domain.models;

import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class RideId extends DomainObjectId {
    private RideId(){
        super(RideId.randomId(RideId.class).getId());
    }
    public RideId(@NonNull String uuid) {
        super(uuid);
    }
}
