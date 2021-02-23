package io.rivigo.Truck.Scheduling.Controller;

import io.rivigo.Truck.Scheduling.Application.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

    @GetMapping("/")
    public String showForm() {
        return "results";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String SaveUser(User user) {
        ModelMap model = new ModelMap();
        model.addAttribute("id", user.getId());
        model.addAttribute("source", user.getSource());
        model.addAttribute("destination", user.getDestination());
        return "results";
    }

}
