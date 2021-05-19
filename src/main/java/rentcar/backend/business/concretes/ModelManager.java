package rentcar.backend.business.concretes;

import org.springframework.stereotype.Service;
import rentcar.backend.business.abstracts.ModelService;
import rentcar.backend.dataaccess.abstracts.ModelRepository;
import rentcar.backend.entities.concrete.Model;

@Service
public class ModelManager implements ModelService {

    private final ModelRepository modelRepository;

    public ModelManager(ModelRepository modelRepository){
        this.modelRepository=modelRepository;
    }

    @Override
    public Iterable<Model> getAllModels() {
        return modelRepository.findAll();
    }

    @Override
    public Model addModel(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public void deleteModel(int id) {
        modelRepository.deleteById(id);
    }
}
