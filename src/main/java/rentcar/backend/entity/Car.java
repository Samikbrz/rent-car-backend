package rentcar.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "car")
public class Car implements DataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @Column(name = "color_name")
    private String colorName;

    @Column(name = "model_year")
    private String modelYear;

    @Column(name = "daily_price")
    private int dailyPrice;

    @Column(name = "description")
    private String description;

    public Car() {
    }

    public Car(int id, Brand brand, String colorName, String modelYear, int dailyPrice, String description) {
        this.id = id;
        this.brand = brand;
        this.colorName = colorName;
        this.modelYear = modelYear;
        this.dailyPrice = dailyPrice;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public int getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}
