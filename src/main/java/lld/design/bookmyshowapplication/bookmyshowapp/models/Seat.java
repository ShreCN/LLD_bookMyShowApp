package lld.design.bookmyshowapplication.bookmyshowapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    @Column(name = "seat_number")
    private int number;
    @Enumerated
    private SeatType seatType;
    private char rowNum;
    private int colNum;
}
