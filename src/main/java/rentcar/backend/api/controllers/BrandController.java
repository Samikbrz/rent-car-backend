package rentcar.backend.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rentcar.backend.business.abstracts.BrandService;
import rentcar.backend.entities.concrete.Brand;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandController {

    private BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService){
        this.brandService=brandService;
    }

    @GetMapping("getall")
    public List<Brand> getAll(){
        return brandService.getAll();
    }
}
