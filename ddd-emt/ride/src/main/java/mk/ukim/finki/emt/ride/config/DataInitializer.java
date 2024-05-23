package mk.ukim.finki.emt.ride.config;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.ride.domain.models.Ride;
import mk.ukim.finki.emt.ride.domain.repository.RideRepository;
import mk.ukim.finki.emt.ride.domain.valueobjects.Location;
import mk.ukim.finki.emt.ride.domain.valueobjects.UserId;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Currency;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataInitializer {
    private final RideRepository rideRepository;

    @PostConstruct
    public void initData(){
        Ride r1 = Ride.build(new UserId("5d9d023c-e4d0-4b4a-bf95-b0abffe1594a"), new Location(5.6,5.3,"Skopje"), new Location(3.8, 4.3, "Strumica"), LocalDateTime.now().plusDays(30) ,5, Money.valueOf(Currency.MKD, 800));
        Ride r2 = Ride.build(new UserId("9ab4d908-ed03-4fcd-8241-3aabb6c378f9"), new Location(5.6,5.3,"Skopje"), new Location(4.5, 5.3, "Sveti Nikole"), LocalDateTime.now().plusDays(30) ,5, Money.valueOf(Currency.MKD, 300));
        if(rideRepository.findAll().isEmpty()){
            rideRepository.saveAll(Arrays.asList(r1,r2));
        }
    }
}
