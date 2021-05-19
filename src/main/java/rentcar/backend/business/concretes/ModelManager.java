package rentcar.backend.business.concretes;

import org.springframework.stereotype.Service;
import rentcar.backend.business.abstracts.ModelService;
import rentcar.backend.core.exception.AlreadyExistsException;
import rentcar.backend.core.exception.NotFoundException;
import rentcar.backend.dataaccess.abstracts.ModelRepository;
import rentcar.backend.entities.concrete.Car;
import rentcar.backend.entities.concrete.Model;

import java.util.Optional;

@Service
public class ModelManager implements ModelService {

    private final ModelRepository modelRepository;

    private Optional<Model> optionalModel;

    public ModelManager(ModelRepository modelRepository){
        this.modelRepository=modelRepository;
    }

    @Override
    public Iterable<Model> getAllModels() {
        return modelRepository.findAll();
    }

    @Override
    public Model addModel(Model model) {
        if (!modelIsPresent(model.getId())){
            throw new AlreadyExistsException("This model already exist");
        }
        return modelRepository.save(model);
    }

    @Override
    public void deleteModel(int id) {
        if (!modelIsPresent(id)){
            throw new NotFoundException("Model is not found!");
        }
        modelRepository.deleteById(id);
    }

    @Override
    public Model updateModel(Model model) {
        if (!modelIsPresent(model.getId())){
            throw new NotFoundException("Model is not found!");
        }
        return modelRepository.save(model);
    }

    private boolean modelIsPresent(int id){
        optionalModel= modelRepository.findById(id);
        if (!optionalModel.isPresent()){
            return true;
        }
        return false;
    }
}
