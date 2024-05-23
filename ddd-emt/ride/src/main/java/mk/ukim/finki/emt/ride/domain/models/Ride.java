package mk.ukim.finki.emt.ride.domain.models;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import mk.ukim.finki.emt.ride.domain.valueobjects.Location;
import mk.ukim.finki.emt.ride.domain.valueobjects.UserId;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

import java.time.LocalDateTime;

@Entity
@Table(name = "ride")
@Getter
public class Ride extends AbstractEntity<RideId> {
    @AttributeOverride(name = "id", column = @Column(name = "driver_id", nullable = false))
    UserId driverID;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "x", column = @Column(name = "start_x")),
            @AttributeOverride(name = "y", column = @Column(name = "start_y")),
            @AttributeOverride(name = "locationName", column = @Column(name = "start_location_name"))
    })
    private Location startLocation;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "x", column = @Column(name = "destination_x")),
            @AttributeOverride(name = "y", column = @Column(name = "destination_y")),
            @AttributeOverride(name = "locationName", column = @Column(name = "destination_location_name"))
    })
    private Location destination;

    private LocalDateTime departureTime;
    private int bookedSeats = 0;
    private Money price;

    public Ride() {
        super(RideId.randomId(RideId.class));
    }

    public static Ride build(UserId driverID, Location startLocation,Location destination,LocalDateTime departureTime,int bookedSeats, Money price){
        Ride ride = new Ride();
        ride.driverID = driverID;
        ride.startLocation = startLocation;
        ride.destination = destination;
        ride.departureTime = departureTime;
        ride.bookedSeats = bookedSeats;
        ride.price = price;
        return ride;
    }

    public void addBookedSeats(int bookedSeats){
        this.bookedSeats = this.bookedSeats + bookedSeats;
    }
    public void removeBookedSeats(int bookedSeats){
        this.bookedSeats -= bookedSeats;
    }
}
