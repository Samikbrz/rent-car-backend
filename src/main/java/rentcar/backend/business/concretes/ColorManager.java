package rentcar.backend.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.backend.business.abstracts.ColorService;
import rentcar.backend.dataaccess.abstracts.ColorRepository;
import rentcar.backend.entities.concrete.Color;

import java.util.List;

@Service
public class ColorManager implements ColorService {

    private ColorRepository colorRepository;

    @Autowired
    public ColorManager(ColorRepository colorRepository){
        this.colorRepository=colorRepository;
    }

    @Override
    public List<Color> getAll() {
        return colorRepository.findAll();
    }
}
