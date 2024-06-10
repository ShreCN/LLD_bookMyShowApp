package lld.design.bookmyshowapplication.bookmyshowapp.repositories;
import lld.design.bookmyshowapplication.bookmyshowapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}