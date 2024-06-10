package lld.design.bookmyshowapplication.bookmyshowapp.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserResponseDto {
    public Long id;

    public RegisterUserResponseDto(Long userById) {
        this.id = userById;
    }
}
