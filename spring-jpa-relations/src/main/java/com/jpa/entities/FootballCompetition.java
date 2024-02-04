package com.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "football_competition")
public class FootballCompetition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "cuantity_price")
    private Integer cuantityPrice;

    @Column(name = "start_day", columnDefinition = "DATE")
    private LocalDate startDay;

    @Column(name = "start_end", columnDefinition = "DATE")
    private LocalDate endDay;

}
