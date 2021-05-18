package rentcar.backend.business.abstracts;

import rentcar.backend.entities.concrete.Brand;

public interface BrandService {

    Iterable<Brand> getAllBrands();
}
