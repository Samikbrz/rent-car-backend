package rentcar.backend.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import rentcar.backend.business.abstracts.BrandService;
import rentcar.backend.entities.concrete.Brand;

@RestController
@RequestMapping("/brands")
public class BrandController {

    private final BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService){
        this.brandService=brandService;
    }

    @GetMapping
    public Iterable<Brand> getAllBrands(){
        return brandService.getAllBrands();
    }

    @PostMapping
    public Brand addBrand(@RequestBody Brand brand){
        return brandService.addBrand(brand);
    }

    @DeleteMapping("/{id}")
    public void deleteBrand(@PathVariable int id){
        brandService.deleteBrand(id);
    }
}
