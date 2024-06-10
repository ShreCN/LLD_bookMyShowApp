package lld.design.bookmyshowapplication.bookmyshowapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "bms_users")
public class User extends BaseModel{
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
}
