package org.spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "trainees")
@NoArgsConstructor
@AllArgsConstructor
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;

    @OneToOne(mappedBy = "trainee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Internship internship;

    public Trainee(String name, String surname, Internship internship) {
        this.name = name;
        this.surname = surname;
        this.internship = internship;
    }

    public Trainee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
