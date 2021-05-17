package rentcar.backend.business.abstracts;

import rentcar.backend.entities.concrete.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> getAllBrands();
}
