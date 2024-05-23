package mk.ukim.finki.emt.ride.domain.repository;

import mk.ukim.finki.emt.ride.domain.models.Ride;
import mk.ukim.finki.emt.ride.domain.models.RideId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, RideId> {
}
