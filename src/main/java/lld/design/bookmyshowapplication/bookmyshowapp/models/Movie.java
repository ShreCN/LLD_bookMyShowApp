package lld.design.bookmyshowapplication.bookmyshowapp.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "movies")
public class Movie extends BaseModel{
    private String name;
    private String language;
    private double rating;
    private int duration;
    private  String category;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", rating=" + rating +
                ", duration=" + duration +
                ", category='" + category + '\'' +
                ", id=" + id +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
