package mk.ukim.finki.emt.ride.services;

import mk.ukim.finki.emt.ride.domain.models.Ride;
import mk.ukim.finki.emt.ride.domain.models.RideId;
import mk.ukim.finki.emt.ride.services.form.RideForm;

import java.util.List;

public interface RideService {
    Ride findById(RideId id);
    Ride createRide(RideForm rideForm);
    Ride addBookedSeats(RideId id, int bookedSeats);
    Ride removeBookedSeats(RideId id, int bookedSeats);
    List<Ride> findAll();
}
