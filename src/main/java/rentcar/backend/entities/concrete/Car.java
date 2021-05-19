package rentcar.backend.entities.concrete;

import rentcar.backend.entities.abstracts.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "cars")
public class Car implements Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "brand_id")
    private int brandId;

    @Column(name = "model_id")
    private int modelId;

    @Column(name = "color_name")
    private String colorName;

    @Column(name = "model_year")
    private String modelYear;

    @Column(name = "daily_price")
    private int dailyPrice;

    @Column(name = "description")
    private String description;

    public Car(){}

    public Car(int id, int brandId, int modelId, String colorName, String modelYear, int dailyPrice, String description) {
        this.id = id;
        this.brandId = brandId;
        this.modelId = modelId;
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

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
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
}
