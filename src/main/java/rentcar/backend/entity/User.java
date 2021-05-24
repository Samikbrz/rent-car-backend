package rentcar.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements DataModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    @NotBlank(message = "First name is mandatory")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "Last name is mandatory")
    private String lastName;

    @Column(name = "tc_no")
    @NotBlank(message = "TC no is mandatory")
    private String tcNo;

    @Column(name = "email")
    @NotBlank(message = "Email is mandatory")
    private String email;

    @Column(name = "password")
    @NotBlank(message = "Password is mandatory")
    private String password;

    @Column(name = "is_active")
    private String isActive;

}
