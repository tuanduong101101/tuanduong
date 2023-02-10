package com.example.motel.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "utilities",schema = "motel")
@ToString(exclude = {"home"})
public class Utilities {
    @jakarta.persistence.Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(name = "name")
    private String Name;
    @Column(name = "price")
    private String Price;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_Home")

    private Home home;
}
