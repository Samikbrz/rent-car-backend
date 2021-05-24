package rentcar.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rentcar.backend.entity.User;
import rentcar.backend.repository.UserRepository;

import javax.transaction.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Transactional
    public User addUser(User user){
        return userRepository.save(user);
    }

}
