package mk.ukim.finki.emt.ride.services.form;

import lombok.Data;
import mk.ukim.finki.emt.ride.domain.valueobjects.Location;
import mk.ukim.finki.emt.ride.domain.valueobjects.UserId;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

import java.time.LocalDateTime;

@Data
public class RideForm {
    //UserId driverID, Location startLocation,Location destination,LocalDateTime departureTime,int bookedSeats, Money price

    UserId driverID;
    Location startLocation;
    Location destination;
    LocalDateTime departureTime;
    int bookedSeats;
    Money price;

}
