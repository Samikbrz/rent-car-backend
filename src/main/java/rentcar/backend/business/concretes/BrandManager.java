package rentcar.backend.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.backend.business.abstracts.BrandService;
import rentcar.backend.dataaccess.abstracts.BrandRepository;
import rentcar.backend.entities.concrete.Brand;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository){
        this.brandRepository=brandRepository;
    }

    @Override
    public Iterable<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @Override
    public Brand addBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public void deleteBrand(int id) {
        brandRepository.deleteById(id);
    }
}
