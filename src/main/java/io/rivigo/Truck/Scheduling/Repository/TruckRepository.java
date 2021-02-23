package io.rivigo.Truck.Scheduling.Repository;

import io.rivigo.Truck.Scheduling.Application.Truck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TruckRepository extends CrudRepository<Truck, Integer> {
   public Optional<Truck> findById(String vehicleNumber);

//public List<Truck> findByTruckLocation(String Location);
}
