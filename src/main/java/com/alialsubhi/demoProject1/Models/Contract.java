package com.alialsubhi.demoProject1.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
@Table(name = "contracts")
public class Contract extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    Agent agent;
    Buyer buyer;
    Seller seller;
    Property property;



}
