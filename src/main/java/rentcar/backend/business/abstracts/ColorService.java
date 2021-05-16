package rentcar.backend.business.abstracts;

import rentcar.backend.entities.concrete.Color;

import java.util.List;

public interface ColorService {

    List<Color> getAll();
}
