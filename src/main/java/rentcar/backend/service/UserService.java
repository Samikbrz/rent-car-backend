package rentcar.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.backend.entity.User;
import rentcar.backend.exception.NotFoundException;
import rentcar.backend.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    private Optional<User> optionalUser;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUsersByName(String name){
        return userRepository.findByName(name);
    }

    @Transactional
    public User addUser(User user){
        return userRepository.save(user);
    }

    @Transactional
    public void deleteUser(int id){
        if (userIsPresent(id)){
            throw new NotFoundException("User is not found!");
        }
        userRepository.deleteById(id);
    }

    @Transactional
    public User updateUser(User user){
        if (userIsPresent(user.getId())){
            throw new NotFoundException("User is not found!");
        }
        return userRepository.save(user);
    }

    private boolean userIsPresent(int id) {
        optionalUser = userRepository.findById(id);
        return optionalUser.isPresent();
    }

}
