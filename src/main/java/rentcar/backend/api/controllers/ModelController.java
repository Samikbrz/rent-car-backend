package rentcar.backend.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rentcar.backend.business.abstracts.ModelService;
import rentcar.backend.entities.concrete.Model;

import java.util.List;

@RestController
@RequestMapping("/api/models")
public class ModelController {

    private ModelService modelService;

    @Autowired
    public ModelController(ModelService modelService){
        this.modelService=modelService;
    }

    @GetMapping("getall")
    public List<Model> getAll(){
        return modelService.getAll();
    }
}
