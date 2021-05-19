package rentcar.backend.entities.concrete;

import rentcar.backend.entities.abstracts.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@javax.persistence.Entity
@Table(name = "models")
public class Model implements Entity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand_id")
    private int brandId;

    @Column(name = "name")
    private String name;

    public Model(){}

    public Model(int id, int brandId, String name) {
        this.id = id;
        this.brandId = brandId;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
