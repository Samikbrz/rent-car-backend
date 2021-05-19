package rentcar.backend.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import rentcar.backend.business.abstracts.ModelService;
import rentcar.backend.entities.concrete.Model;

@RestController
@RequestMapping("/models")
public class ModelController {

    private final ModelService modelService;

    @Autowired
    public ModelController(ModelService modelService){
        this.modelService=modelService;
    }

    @GetMapping
    public Iterable<Model> getAll(){
        return modelService.getAllModels();
    }

    @PostMapping
    public Model addModel(@RequestBody Model model){
        return modelService.addModel(model);
    }

    @DeleteMapping("/{id}")
    public void deleteModel(@PathVariable int id){
        modelService.deleteModel(id);
    }
}
