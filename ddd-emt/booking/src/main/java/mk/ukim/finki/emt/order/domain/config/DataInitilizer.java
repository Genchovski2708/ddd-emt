package mk.ukim.finki.emt.order.domain.config;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.order.domain.model.Booking;
import mk.ukim.finki.emt.order.domain.repository.BookingRepository;
import mk.ukim.finki.emt.order.domain.valueobjects.RideId;
import mk.ukim.finki.emt.order.domain.valueobjects.UserId;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Currency;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Component
@AllArgsConstructor
public class DataInitilizer {
    //@NonNull RideId rideID, @NonNull UserId passengerID, int seatsBooked, @NonNull LocalDateTime bookingTime, @NonNull Money totalPrice
    BookingRepository bookingRepository;

    @PostConstruct
    public void initData(){
        Booking booking1 = new Booking(new RideId("98c43d07-f7fa-417d-99f1-d758a65fe431"),new UserId("9ab4d908-ed03-4fcd-8241-3aabb6c378f9"),2, LocalDateTime.now(), Money.valueOf(Currency.MKD,1600));
        Booking booking2 = new Booking(new RideId("624f1e8c-d26e-4b45-ac5c-33dee9cf1aad"),new UserId("74517d75-573b-4c86-bf29-efb1d0ea0407"),4, LocalDateTime.now(), Money.valueOf(Currency.MKD,1200));
        if(bookingRepository.findAll().isEmpty()){
            bookingRepository.saveAll(Arrays.asList(booking1,booking2));
        }
    }

}
