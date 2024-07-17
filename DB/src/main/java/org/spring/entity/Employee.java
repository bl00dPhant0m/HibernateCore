package org.spring.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private int salary;
    @Column(nullable = false)
    private LocalDate birthDate;


    @ToString.Exclude
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "trainee_id")

    private Trainee trainee;

    public Employee(String name, String surname, int salary, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public Employee(String name, String surname, int salary, LocalDate birthDate, Trainee trainee) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.birthDate = birthDate;
        this.trainee = trainee;
    }


}
