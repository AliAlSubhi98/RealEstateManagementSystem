package com.alialsubhi.demoProject1.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Setter
@Getter
@Entity
@Table(name = "listings")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    Date datePosted;
    @OneToMany
    @JoinColumn(name = "id")
    List<Property> properties;

    @ManyToOne
    @JoinColumn(name = "id")
    Agent agent;


}
