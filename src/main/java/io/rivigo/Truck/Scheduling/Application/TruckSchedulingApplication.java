package io.rivigo.Truck.Scheduling.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"io.rivigo.Truck.Scheduling"})
public class TruckSchedulingApplication {


    public static void main(String[] args) {
        SpringApplication.run(TruckSchedulingApplication.class, args);
    }

}
