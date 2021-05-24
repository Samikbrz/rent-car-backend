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
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "rentals")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rental implements DataModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "car_id")
    @NotBlank(message = "Name is mandatory")
    private Car car;

    @OneToOne
    @JoinColumn(name = "user_id")
    @NotBlank(message = "Name is mandatory")
    private User user;

    @Column(name = "rent_date")
    @NotBlank(message = "Name is mandatory")
    private Date rentDate;

    @Column(name = "return_date")
    @NotBlank(message = "Name is mandatory")
    private Date returnDate;

}