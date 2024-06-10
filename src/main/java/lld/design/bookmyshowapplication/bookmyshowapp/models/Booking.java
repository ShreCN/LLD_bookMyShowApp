package lld.design.bookmyshowapplication.bookmyshowapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
@Builder
public class Booking extends BaseModel{
    @OneToMany(mappedBy = "booking")
    private List<ShowSeat> showSeatList;
    private Date bookedAt;
    @ManyToOne
    private Show show;
    private double amount;
    @Enumerated
    private PaymentType paymentType;
}
