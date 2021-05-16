package rentcar.backend.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.backend.business.abstracts.BrandService;
import rentcar.backend.dataaccess.abstracts.BrandRepository;
import rentcar.backend.entities.concrete.Brand;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository){
        this.brandRepository=brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }
}
