package lld.design.bookmyshowapplication.bookmyshowapp.services;

import lld.design.bookmyshowapplication.bookmyshowapp.exceptions.BadRequestException;
import lld.design.bookmyshowapplication.bookmyshowapp.models.Booking;
import lld.design.bookmyshowapplication.bookmyshowapp.models.ShowSeat;
import lld.design.bookmyshowapplication.bookmyshowapp.models.ShowSeatStatus;
import lld.design.bookmyshowapplication.bookmyshowapp.repositories.BookingRepository;
import lld.design.bookmyshowapplication.bookmyshowapp.repositories.ShowSeatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class BookingService {
    private final ShowSeatRepository showSeatRepository;
    private final BookingRepository bookingRepository;
    public BookingService(ShowSeatRepository showSeatRepository, BookingRepository bookingRepository){
        this.showSeatRepository = showSeatRepository;
        this.bookingRepository = bookingRepository;
    }
@Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookMovie(List<Long> showSeatIds){
        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);

        for(ShowSeat showSeat: showSeats){
            if(showSeats.size() != showSeatIds.size()){
                throw new BadRequestException("Seat not available");
            }
            showSeat.setShowSeatStatus(ShowSeatStatus.BLOCKED);
        }
        // save the new status(BLOCKED) to database
        showSeatRepository.saveAll(showSeats);

        Booking booking = Booking.builder()
                .bookedAt(new Date())
                .amount(12.0)
                .showSeatList((showSeats))
                .show(showSeats.get(0).getShow())
                .build();
        return booking;
    }

}
