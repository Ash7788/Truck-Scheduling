package io.rivigo.Truck.Scheduling.Controller;


import io.rivigo.Truck.Scheduling.Application.Truck;

import io.rivigo.Truck.Scheduling.Application.User;
import io.rivigo.Truck.Scheduling.Service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TruckController {
    @Autowired
    private TruckService truckService;


    @RequestMapping(method = RequestMethod.GET,value = "/trucks")
    public List<Truck> getAllTrucks() {
        return truckService.getAllTrucks();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/trucks/{vehicleNumber}")
    public Optional<Truck> getTruck(@PathVariable String VehicleNumber) {
        return truckService.getTruck(VehicleNumber);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/trucks")
    public void addTruck(@RequestBody Truck truck) {
        truckService.addTruck(truck);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/trucks/{id}")
    public void UpdateTruck(@RequestBody Truck truck, @PathVariable int id) {
        truckService.updateTruck(id, truck);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/trucks/{id}")
    public void deleteTruck(@PathVariable Integer id) {
        truckService.deleteTruck(id);
    }

    @RequestMapping("/trucks/available")
    public String getVehicleNumber(User user) {
        return truckService.getVehicleNumber(user);
    }

    @RequestMapping("/trucks/test")
    public String response(User user) {
        return truckService.response(user);
    }
}
