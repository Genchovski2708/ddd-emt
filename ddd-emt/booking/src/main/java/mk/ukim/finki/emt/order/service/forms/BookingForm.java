package mk.ukim.finki.emt.order.service.forms;

import lombok.Data;
import mk.ukim.finki.emt.order.domain.valueobjects.Ride;
import mk.ukim.finki.emt.order.domain.valueobjects.User;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class BookingForm {
//@NonNull Ride ride, User user, int seats
    @NotNull
    Ride ride;

    @NotNull
    User user;

    @Min(1)
    int bookedSeats = 1;
}
