package mk.ukim.finki.emt.order.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.order.domain.model.Booking;
import mk.ukim.finki.emt.order.domain.model.BookingId;
import mk.ukim.finki.emt.order.domain.repository.BookingRepository;
import mk.ukim.finki.emt.order.service.BookingService;
import mk.ukim.finki.emt.order.service.forms.BookingForm;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;



    @Override
    public BookingId createBooking(BookingForm bookingForm) {
        Objects.requireNonNull(bookingForm, "booking must not be null");
        var newBooking = bookingRepository.saveAndFlush(toDomainObject(bookingForm));
        return newBooking.getId();
    }

    @Override
    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Optional<Booking> findById(BookingId id) {
        return bookingRepository.findById(id);
    }

    private Booking toDomainObject(BookingForm bookingForm){
        return new Booking(bookingForm.getRide().getId(), bookingForm.getUser().getId(), bookingForm.getBookedSeats(), LocalDateTime.now(), bookingForm.getRide().getPrice().multiply(bookingForm.getBookedSeats()));
    }
}
