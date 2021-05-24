package rentcar.backend.service;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.backend.entity.Brand;
import rentcar.backend.exception.AlreadyExistsException;
import rentcar.backend.exception.NotFoundException;
import rentcar.backend.repository.BrandRepository;

@Service
public class BrandService {

    private final BrandRepository brandRepository;

    private Optional<Brand> optionalBrand;

    @Autowired
    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public Iterable<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @Transactional
    public Brand addBrand(Brand brand) {
        optionalBrand = brandRepository.findByName(brand.getName());
        if (optionalBrand.isPresent()) {
            throw new AlreadyExistsException("This brand already exist!");
        }
        return brandRepository.save(brand);
    }

    @Transactional
    public void deleteBrand(int id) {
        if (!brandIsPresent(id)) {
            throw new NotFoundException("Brand is not found!");
        }
        brandRepository.deleteById(id);
    }

    @Transactional
    public Brand updateBrand(Brand brand) {
        if (!brandIsPresent(brand.getId())) {
            throw new NotFoundException("Brand is not found");
        }
        return brandRepository.save(brand);
    }

    private boolean brandIsPresent(int id) {
        optionalBrand = brandRepository.findById(id);
        return optionalBrand.isEmpty();
    }
}
