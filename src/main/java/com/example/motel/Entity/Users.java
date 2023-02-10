package com.example.motel.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "homes")
@Entity
@Table(name = "users",schema = "motel")
public class Users {
    @jakarta.persistence.Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(name = "name")
    private String Name;
    @Column(name = "phone",unique = true)
    private String Phone;
    @Column(name = "email",nullable = true,unique = true)
    private String Email;
    @Column(name = "address")
    private String Address;
    @Column(name = "Gender",nullable = true)
    private String Gender;
    @Column(name = "dob",nullable = true)
    private Date DOB;
    @Column(name = "role")
    private String Role;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private List<Home> homes;
    @Column(name = "password")
    private String Password;


}
