package mk.ukim.finki.emt.ride.xport.rest;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.ride.domain.models.Ride;
import mk.ukim.finki.emt.ride.services.RideService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ride")
@AllArgsConstructor
public class RideResource {
    private final RideService rideService;

    @GetMapping
    List<Ride> getAll(){
        return rideService.findAll();
    }
}
