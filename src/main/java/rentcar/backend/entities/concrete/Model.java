package rentcar.backend.entities.concrete;

import rentcar.backend.entities.abstracts.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "models")
public class Model implements Entity {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "brand_id")
    private int brandId;

    @Column(name = "name")
    private int name;

    public Model(){}

    public Model(int id, int brandId, int name) {
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

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

}
