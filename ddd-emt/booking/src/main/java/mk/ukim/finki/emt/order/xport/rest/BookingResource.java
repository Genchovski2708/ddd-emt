package mk.ukim.finki.emt.order.xport.rest;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.order.domain.model.Booking;
import mk.ukim.finki.emt.order.service.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/booking")
@AllArgsConstructor
public class BookingResource {
    BookingService bookingService;
    @GetMapping
    public List<Booking> getAll(){
        return bookingService.findAll();
    }
}
