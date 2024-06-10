package lld.design.bookmyshowapplication.bookmyshowapp.repositories;

import lld.design.bookmyshowapplication.bookmyshowapp.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
    public List<ShowSeat> findAllById(Iterable<Long> ids);

}
