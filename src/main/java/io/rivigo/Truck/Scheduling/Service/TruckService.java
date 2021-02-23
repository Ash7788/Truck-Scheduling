package io.rivigo.Truck.Scheduling.Service;

import io.rivigo.Truck.Scheduling.Application.Truck;
import io.rivigo.Truck.Scheduling.Application.User;
import io.rivigo.Truck.Scheduling.Repository.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class TruckService  {
   // Scanner scanner = new Scanner(System.in);
    @Autowired
    private TruckRepository truckRepository;

    public List<Truck> getAllTrucks() {
        List<Truck> trucks = new ArrayList<>();
        for (Truck truck : truckRepository.findAll()) {
            trucks.add(truck);
        }
        return trucks;
    }

    public String getVehicleNumber(User user) {
        //user.setSource(scanner.next());
        String source = user.getSource();
        for (Truck truck : truckRepository.findAll()) {
            if (truck.getLocation().equals(source) && (truck.getStatus().equals("Available"))) {
                return truck.getVehicleNumber();
            }
        }
        return "Not available";
    }

    public String getCost(User user) {
       // user.setSource(scanner.next());
        String source = user.getSource();
      //  user.setDestination(scanner.next());
        String destination = user.getDestination();

        if ((source.equals("Delhi") && (destination.equals("Chennai"))) || (source.equals("Chennai") && (destination.equals("Delhi")))) {
            return "65,000";
        } else if ((source.equals("Delhi") && (destination.equals("Mumbai"))) || (source.equals("Mumbai") && (destination.equals("Delhi")))) {
            return "50,000";
        } else if ((source.equals("Delhi") && (destination.equals("Kolkata"))) || (source.equals("Kolkata") && (destination.equals("Delhi")))) {
            return "60,000";
        } else if ((source.equals("Chennai") && (destination.equals("Mumbai"))) || (source.equals("Mumbai") && (destination.equals("Chennai")))) {
            return "50,000";
        } else if ((source.equals("Kolkata") && (destination.equals("Mumbai"))) || (source.equals("Mumbai") && (destination.equals("Kolkata")))) {
            return "65,000";
        } else if ((source.equals("Chennai") && (destination.equals("Kolkata"))) || (source.equals("Kolkata") && (destination.equals("Chennai")))) {
            return "60,000";
        } else return " ";
    }

    public String response(User user) {
        String vehicleNumber = getVehicleNumber(user);
        String cost = getCost(user);

        return ("Vehicle Number :" + vehicleNumber + "  Cost :" + cost);
    }


    public Optional<Truck> getTruck(String VehicleNumber) {
        return truckRepository.findById(VehicleNumber);
    }

    public void addTruck(Truck truck) {
        truckRepository.save(truck);
    }

    public void updateTruck(int id, Truck truck) {
        truckRepository.save(truck);
    }

    public void deleteTruck(int id) {
        truckRepository.deleteById(id);
    }

}
