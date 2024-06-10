package lld.design.bookmyshowapplication.bookmyshowapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Region extends BaseModel {
    private String name;
    @OneToMany(mappedBy = "region")
    private List<Theatre> theatreList;
    private double longitude;
    private double latitude;
}
