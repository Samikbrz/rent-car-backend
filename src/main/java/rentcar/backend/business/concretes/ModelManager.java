package rentcar.backend.business.concretes;

import org.springframework.stereotype.Service;
import rentcar.backend.business.abstracts.ModelService;
import rentcar.backend.dataaccess.abstracts.ModelRepository;
import rentcar.backend.entities.concrete.Model;

import java.util.List;

@Service
public class ModelManager implements ModelService {

    private ModelRepository modelRepository;

    public ModelManager(ModelRepository modelRepository){
        this.modelRepository=modelRepository;
    }

    @Override
    public List<Model> getAll() {
        return modelRepository.findAll();
    }
}
