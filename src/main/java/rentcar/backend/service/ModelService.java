package rentcar.backend.service;

import java.util.Optional;
import org.springframework.stereotype.Service;
import rentcar.backend.entity.Model;
import rentcar.backend.exception.NotFoundException;
import rentcar.backend.repository.ModelRepository;

@Service
public class ModelService {

    private final ModelRepository modelRepository;

    private Optional<Model> optionalModel;

    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    public Iterable<Model> getAllModels() {
        return modelRepository.findAll();
    }

    public Model addModel(Model model) {
        return modelRepository.save(model);
    }

    public void deleteModel(int id) {
        if (modelIsPresent(id)) {
            throw new NotFoundException("Model is not found!");
        }
        modelRepository.deleteById(id);
    }

    public Model updateModel(Model model) {
        if (!modelIsPresent(model.getId())) {
            throw new NotFoundException("Model is not found!");
        }
        return modelRepository.save(model);
    }

    private boolean modelIsPresent(int id) {
        optionalModel = modelRepository.findById(id);
        if (!optionalModel.isPresent()) {
            return true;
        }
        return false;
    }
}
