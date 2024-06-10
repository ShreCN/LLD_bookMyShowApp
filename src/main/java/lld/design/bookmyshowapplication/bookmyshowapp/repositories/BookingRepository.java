package lld.design.bookmyshowapplication.bookmyshowapp.repositories;

import lld.design.bookmyshowapplication.bookmyshowapp.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
