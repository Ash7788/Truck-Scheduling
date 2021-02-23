package io.rivigo.Truck.Scheduling.Service;

import io.rivigo.Truck.Scheduling.Repository.UserRepository;
import io.rivigo.Truck.Scheduling.Application.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public Optional<User> getUser(int id) {
        return userRepository.findById(id);
    }


    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        for (User user : userRepository.findAll()) {
            users.add(user);
        }
        return users;
    }

}
