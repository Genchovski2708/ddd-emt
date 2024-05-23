package mk.ukim.finki.emt.ride.services.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.ride.domain.models.Ride;
import mk.ukim.finki.emt.ride.domain.models.RideId;
import mk.ukim.finki.emt.ride.domain.exceptions.RideNotFoundException;
import mk.ukim.finki.emt.ride.domain.repository.RideRepository;
import mk.ukim.finki.emt.ride.services.RideService;
import mk.ukim.finki.emt.ride.services.form.RideForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class RideServiceImpl implements RideService {

    private final RideRepository rideRepository;

    @Override
    public Ride findById(RideId id) {
        return rideRepository.findById(id).orElseThrow(RideNotFoundException::new);
    }

    @Override
    public Ride createRide(RideForm rideForm) {
        //UserId driverID, Location startLocation,Location destination,LocalDateTime departureTime,int bookedSeats, Money price
        Ride r = Ride.build(rideForm.getDriverID(),rideForm.getStartLocation(),rideForm.getDestination(), rideForm.getDepartureTime(), rideForm.getBookedSeats(), rideForm.getPrice());
        rideRepository.save(r);
        return r;
    }

    @Override
    public Ride addBookedSeats(RideId id, int bookedSeats) {
        Ride r = this.findById(id);
        r.addBookedSeats(bookedSeats);
        rideRepository.saveAndFlush(r);
        return r;
    }

    @Override
    public Ride removeBookedSeats(RideId id, int bookedSeats) {
        Ride r = this.findById(id);
        r.removeBookedSeats(bookedSeats);
        rideRepository.saveAndFlush(r);
        return r;
    }

    @Override
    public List<Ride> findAll() {
        return rideRepository.findAll();
    }
}
