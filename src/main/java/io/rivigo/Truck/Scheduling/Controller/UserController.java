package io.rivigo.Truck.Scheduling.Controller;

import io.rivigo.Truck.Scheduling.Application.User;
import io.rivigo.Truck.Scheduling.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllTrucks(){
        return userService.getAllUsers();
    }
    @RequestMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/users")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

}
