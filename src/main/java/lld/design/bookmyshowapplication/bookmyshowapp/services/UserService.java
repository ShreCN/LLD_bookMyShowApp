package lld.design.bookmyshowapplication.bookmyshowapp.services;

import lld.design.bookmyshowapplication.bookmyshowapp.exceptions.BadRequestException;
import lld.design.bookmyshowapplication.bookmyshowapp.models.User;
import lld.design.bookmyshowapplication.bookmyshowapp.repositories.UserRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;
    public  UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Long getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new BadRequestException("User not available");
        }
        return user.get().getId();
    }

    public User registerUser(String name, String email, String password) {
        User newUser = new User().builder()
                .name(name)
                .email(email)
                .password(password).build();

        return userRepository.save(newUser);
    }
}
