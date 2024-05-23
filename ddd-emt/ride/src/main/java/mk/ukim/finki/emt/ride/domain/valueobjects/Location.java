package mk.ukim.finki.emt.ride.domain.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class Location implements ValueObject {
    @Column(name = "x")
    private final double x;

    @Column(name = "y")
    private final double y;

    @Column(name = "location_name")
    private final String locationName;

    protected Location() {
        this.x = 0.0;
        this.y = 0.0;
        this.locationName = "";
    }

    public Location(double x, double y, String locationName) {
        this.x = x;
        this.y = y;
        this.locationName = locationName;
    }
}
