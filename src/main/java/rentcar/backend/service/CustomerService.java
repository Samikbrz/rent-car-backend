package rentcar.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.backend.entity.Customer;
import rentcar.backend.exception.NotFoundException;
import rentcar.backend.repository.CustomerRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    private Optional<Customer> optionalCustomer;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @Transactional
    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    @Transactional
    public void deleteCustomer(int id){
        if (customerIsPresent(id)){
            throw new NotFoundException("Customer is not found");
        }
        customerRepository.deleteById(id);
    }

    private boolean customerIsPresent(int id) {
        optionalCustomer = customerRepository.findById(id);
        return optionalCustomer.isPresent();
    }
}
