package rentcar.backend.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rentcar.backend.business.abstracts.CarService;
import rentcar.backend.business.abstracts.ColorService;
import rentcar.backend.entities.concrete.Color;

import java.util.List;

@RestController
@RequestMapping("/api/colors")
public class ColorController {

    private ColorService colorService;

    @Autowired
    public ColorController(ColorService colorService){
        this.colorService=colorService;
    }

    @GetMapping
    public List<Color> getAll(){
        return colorService.getAll();
    }
}
