package lld.design.bookmyshowapplication.bookmyshowapp.controllers;

import lld.design.bookmyshowapplication.bookmyshowapp.dtos.RegisterUserRequestDto;
import lld.design.bookmyshowapplication.bookmyshowapp.dtos.RegisterUserResponseDto;
import lld.design.bookmyshowapplication.bookmyshowapp.models.User;
import lld.design.bookmyshowapplication.bookmyshowapp.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public RegisterUserResponseDto getUser(@PathVariable Long id){
        return new RegisterUserResponseDto(userService.getUserById(id));
    }
    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public RegisterUserResponseDto registerUser(@RequestBody RegisterUserRequestDto requestDto){
        User user = userService.registerUser(requestDto.getName(),
                                                requestDto.getEmail(),
                                                requestDto.getPassword());

        return new RegisterUserResponseDto(user.getId());

    }

}
