package dev.panoleksa.ffood.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Integer role_id;
    private String phone;
}
