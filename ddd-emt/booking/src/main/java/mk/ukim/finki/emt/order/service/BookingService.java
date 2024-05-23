package mk.ukim.finki.emt.order.service;

import mk.ukim.finki.emt.order.domain.model.Booking;
import mk.ukim.finki.emt.order.domain.model.BookingId;
import mk.ukim.finki.emt.order.service.forms.BookingForm;

import java.util.List;
import java.util.Optional;

public interface BookingService {

    BookingId createBooking(BookingForm bookingForm);
    List<Booking> findAll();
    Optional<Booking> findById(BookingId id);


}
