package mk.ukim.finki.emt.user.domain.models;

import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class UserId extends DomainObjectId {
    private UserId(){
        super(UserId.randomId(UserId.class).getId());
    }
    public UserId(@NonNull String uuid) {
        super(uuid);
    }
}
