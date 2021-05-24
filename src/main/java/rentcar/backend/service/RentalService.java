package rentcar.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.backend.entity.Rental;
import rentcar.backend.exception.NotFoundException;
import rentcar.backend.repository.RentalRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class RentalService {

    private final RentalRepository rentalRepository;

    private Optional<Rental> optionalRental;

    @Autowired
    public RentalService(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    public Iterable<Rental> getAllRentals(){
        return rentalRepository.findAll();
    }

    @Transactional
    public Rental addRental(Rental rental){
        return rentalRepository.save(rental);
    }

    @Transactional
    public void deleteRental(int id){
        if (rentalIsPresent(id)){
            throw new NotFoundException("Rental is not found");
        }
        rentalRepository.deleteById(id);
    }

    @Transactional
    public Rental updateRental(Rental rental){
        if (rentalIsPresent(rental.getId())){
            throw new NotFoundException("Rental is not found");
        }
        return rentalRepository.save(rental);
    }

    private boolean rentalIsPresent(int id) {
        optionalRental = rentalRepository.findById(id);
        return optionalRental.isPresent();
    }

}
