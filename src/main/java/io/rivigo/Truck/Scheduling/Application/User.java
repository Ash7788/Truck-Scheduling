package io.rivigo.Truck.Scheduling.Application;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user")
public class User {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "source")
    private String source;

    @Column(name = "destination")
    private String destination;
}

