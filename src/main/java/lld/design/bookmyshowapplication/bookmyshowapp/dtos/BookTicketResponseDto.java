package lld.design.bookmyshowapplication.bookmyshowapp.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Builder
@Getter
@Setter
public class BookTicketResponseDto {
    private Long bookingId;
    private double amount;
    private List<Long> seatNumbers;
    private String theatreName;
}
