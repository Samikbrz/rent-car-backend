package rentcar.backend.entities.concrete;

import rentcar.backend.entities.abstracts.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "colors")
public class Color implements Entity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int id;

    @Column(name = "name")
    public String name;

    public Color(){}

    public Color(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
