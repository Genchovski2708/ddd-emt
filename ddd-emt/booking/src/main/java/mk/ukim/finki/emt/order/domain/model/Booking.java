package mk.ukim.finki.emt.order.domain.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.order.domain.valueobjects.Ride;
import mk.ukim.finki.emt.order.domain.valueobjects.RideId;
import mk.ukim.finki.emt.order.domain.valueobjects.User;
import mk.ukim.finki.emt.order.domain.valueobjects.UserId;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "booking")
@Getter
public class Booking extends AbstractEntity<BookingId> {

    @AttributeOverride(name = "id", column = @Column(name = "ride_id", nullable = false))
    RideId rideID;

    @AttributeOverride(name = "id", column = @Column(name = "passenger_id", nullable = false))

    UserId passengerID;
    @Column(name = "seats_booked", nullable = false)
    int seatsBooked;
    LocalDateTime bookingTime;
    Money totalPrice;

    public Booking() {
        super(BookingId.randomId(BookingId.class));
    }

    public Booking(@NonNull RideId rideID, @NonNull UserId passengerID, int seatsBooked, @NonNull LocalDateTime bookingTime, @NonNull Money totalPrice) {
        super(BookingId.randomId(BookingId.class));
        this.rideID = rideID;
        this.passengerID = passengerID;
        this.seatsBooked = seatsBooked;
        this.bookingTime = bookingTime;
        this.totalPrice = totalPrice;
    }

//    public Booking bookRide(@NonNull Ride ride, @NonNull User user, int seats){
//        Objects.requireNonNull(ride, "Ride must not be null");
//        Objects.requireNonNull(user, "User must not be null");
//        return new Booking(ride.getId(), user.getId(), user.getBookedSeats(), LocalDateTime.now(), ride.getPrice().multiply(user.getBookedSeats()));
//    }
}
