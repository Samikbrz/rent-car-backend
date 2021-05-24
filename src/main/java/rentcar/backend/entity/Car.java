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

@Entity
@Table(name = "cars")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car implements DataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "brand_id")
    @NotBlank(message = "Name is mandatory")
    private Brand brand;

    @Column(name = "color_name")
    @NotBlank(message = "Name is mandatory")
    private String colorName;

    @Column(name = "model_year")
    @NotBlank(message = "Name is mandatory")
    private String modelYear;

    @Column(name = "daily_price")
    @NotBlank(message = "Name is mandatory")
    private int dailyPrice;

    @Column(name = "description")
    @NotBlank(message = "Name is mandatory")
    private String description;

}
