package rentcar.backend.business.abstracts;

import rentcar.backend.entities.concrete.Model;

import java.util.List;

public interface ModelService {

    List<Model> getAllModels();
}
