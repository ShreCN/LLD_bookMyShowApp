package lld.design.bookmyshowapplication.bookmyshowapp.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Builder
public class BookTicketRequestDto {
    List<Long> showSeatId;
}
