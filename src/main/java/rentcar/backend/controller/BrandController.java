package rentcar.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rentcar.backend.entity.Brand;
import rentcar.backend.service.BrandService;
import rentcar.backend.utilities.results.DataResult;
import rentcar.backend.utilities.results.Result;

import javax.validation.Valid;

@RestController
@RequestMapping("/brands")
public class BrandController {

    private final BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping
    public DataResult<Iterable<Brand>> getAllBrands() {
        return this.brandService.getAllBrands();
    }

    @PostMapping
    public Brand addBrand(@Valid @RequestBody Brand brand) {
        return brandService.addBrand(brand);
    }

    @DeleteMapping("/{id}")
    public void deleteBrand(@PathVariable int id) {
        brandService.deleteBrand(id);
    }

    @PutMapping("/{id}")
    public Brand updateBrand(@RequestBody Brand brand, @PathVariable int id) {
        brand.setId(id);
        return brandService.updateBrand(brand);
    }
    
}
