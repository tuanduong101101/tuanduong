package com.example.motel.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

import java.util.Date;


import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"users", "utilities","breakdown"})
@Entity
@Table(name = "home",schema = "motel")
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "status")
    private Integer Status;
    @Column(name = "date")
    private Date Date;
    @Column(name = "price")
    private Integer Price;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "postedby")
    private Users users;
    @Column(name = "posterphone")
    private String PosterPhone;
    @Column(name = "posteremail")
    private String PosterEmail;
    @Column(name = "address")
    private String Address;
    @Column(name = "desprition")
    private String Desprition;
    @Column(name = "bedroom")
    private boolean BedRoom;
    @Column(name = "kitchen")
    private boolean Kitchen;
    @Column(name = "bathroom")
    private boolean BathRoom;
    @Column(name = "aircondition")
    private boolean AirCondition;
    @Column(name = "heater")
    private boolean Heater;
    @Column(name = "elevator", nullable = true)
    private boolean Elevator;
    @Column(name = "closet", nullable = true)
    private boolean Closet;
    @Column(name = "fridge", nullable = true)
    private boolean Fridge;
    @Column(name = "garret", nullable = true)
    private boolean Garret;
    @Column(name = "washingmachine", nullable = true)
    private boolean WashingMachine;
    @OneToMany(mappedBy = "home")
    private List<Breakdown> breakdowns;
    @OneToMany(mappedBy = "home")
    private List<Utilities> utilities;

}

