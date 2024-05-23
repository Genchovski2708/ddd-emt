package mk.ukim.finki.emt.order.domain.repository;

import mk.ukim.finki.emt.order.domain.model.Booking;
import mk.ukim.finki.emt.order.domain.model.BookingId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, BookingId> {
}
