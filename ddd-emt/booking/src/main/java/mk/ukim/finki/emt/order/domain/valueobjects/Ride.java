package mk.ukim.finki.emt.order.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Currency;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

@Getter
public class Ride implements ValueObject {
    private final RideId id;
    private final Money price;
    private final int availableSeats;

    public Ride() {
        this.id = new RideId();
        price = new Money(Currency.MKD, 0);
        availableSeats = 0;
    }

    @JsonCreator
    public Ride(RideId id, Money price, int availableSeats) {
        this.id = id;
        this.price = price;
        this.availableSeats = availableSeats;
    }
}
