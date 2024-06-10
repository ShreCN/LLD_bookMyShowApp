package lld.design.bookmyshowapplication.bookmyshowapp.controllers;

import lld.design.bookmyshowapplication.bookmyshowapp.dtos.BookTicketRequestDto;
import lld.design.bookmyshowapplication.bookmyshowapp.dtos.BookTicketResponseDto;
import lld.design.bookmyshowapplication.bookmyshowapp.models.BaseModel;
import lld.design.bookmyshowapplication.bookmyshowapp.models.Booking;
import lld.design.bookmyshowapplication.bookmyshowapp.repositories.MovieRepository;
import lld.design.bookmyshowapplication.bookmyshowapp.services.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
public class TicketController {

    private BookingService bookingService;
    public TicketController(BookingService bookingService){
        this.bookingService = bookingService;
    }


    @PostMapping("/book")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody BookTicketResponseDto bookTicket(@RequestBody BookTicketRequestDto requestDto){
        Booking booking = bookingService.bookMovie(requestDto.getShowSeatId());
        return BookTicketResponseDto.builder()
                .bookingId(booking.getId())
                .amount(booking.getAmount())
                .seatNumbers(booking.getShowSeatList().stream().map(BaseModel::getId).collect(Collectors.toList()))
                .theatreName(booking.getShow().getScreen().getTheatre().getName())
                .build();
    }

}
