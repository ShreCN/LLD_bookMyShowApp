package lld.design.bookmyshowapplication.bookmyshowapp.repositories;

import lld.design.bookmyshowapplication.bookmyshowapp.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Optional<Movie> findMovieByName(String name);
    Optional<Movie> findMovieByNameAndCategory(String name, String category);
}
