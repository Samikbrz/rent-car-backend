package rentcar.backend.business.abstracts;

import rentcar.backend.entities.concrete.Model;

public interface ModelService {

    Iterable<Model> getAllModels();

    Model addModel(Model model);
}
