package rentcar.backend.entities.concrete;

import rentcar.backend.core.entities.Model;

public class Brand implements Model {

    public int Id;
    public String Name;

    public Brand(int id, String name) {
        Id = id;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
