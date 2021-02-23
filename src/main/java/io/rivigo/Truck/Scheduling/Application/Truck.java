package io.rivigo.Truck.Scheduling.Application;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "truck")
@Entity
public class Truck {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "Vehicle_number")
    private String vehicleNumber;
    @Column(name = "Location")
    private String location;
    @Column(name = "Status")
    private String status;

}