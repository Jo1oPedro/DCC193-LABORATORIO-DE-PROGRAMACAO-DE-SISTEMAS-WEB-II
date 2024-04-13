package com.example.fcmsapi.model.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private Integer audienceNumber;
    @ManyToOne
    private Team winner;
    @ManyToOne
    private Team loser;

    @ManyToOne
    private Championship championship;
}
