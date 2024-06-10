package lld.design.bookmyshowapplication.bookmyshowapp.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserRequestDto {
    private String name;
    private String email;
    private String password;
}
