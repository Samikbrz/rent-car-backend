package rentcar.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rentcar.backend.entity.Rental;
import rentcar.backend.service.RentalService;

import javax.validation.Valid;

@RestController
@RequestMapping("/rentals")
public class RentalController {

    private final RentalService rentalService;

    @Autowired
    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping
    public Iterable<Rental> getAllRentals(){
        return rentalService.getAllRentals();
    }

    @PostMapping
    public Rental addRental(@Valid @RequestBody Rental rental){
        return rentalService.addRental(rental);
    }

}
