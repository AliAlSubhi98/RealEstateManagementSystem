package com.alialsubhi.demoProject1.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

    @Data
    @Setter
    @Getter
    @Entity
    @Table(name = "buyers")
    public class Seller {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;

        String name;
        String email;
        int phoneNumber;

}
