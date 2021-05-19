package rentcar.backend.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.backend.business.abstracts.BrandService;
import rentcar.backend.core.exception.AlreadyExistsException;
import rentcar.backend.core.exception.NotFoundException;
import rentcar.backend.dataaccess.abstracts.BrandRepository;
import rentcar.backend.entities.concrete.Brand;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class BrandManager implements BrandService {

    private final BrandRepository brandRepository;

    private Optional<Brand> optionalBrand;

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
        if (!brandIsPresent(brand)){
            throw new AlreadyExistsException("This brand already exist!");
        }
        return brandRepository.save(brand);
    }

    @Override
    @Transactional
    public void deleteBrand(int id) {
        optionalBrand=brandRepository.findById(id);
        if (optionalBrand.isPresent()){
            throw new NotFoundException("Brand is not found!");
        }
        brandRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Brand updateBrand(Brand brand) {
        if (!brandIsPresent(brand)){
            throw new NotFoundException("Brand is not found");
        }
        return brandRepository.save(brand);
    }

    private boolean brandIsPresent(Brand brand){
        optionalBrand= brandRepository.findById(brand.getId());
        if (!optionalBrand.isPresent()){
            return true;
        }
        return false;
    }
}
