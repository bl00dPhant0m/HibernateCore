package org.spring.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "internships")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Internship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nameOfInstitute;
    @Column(nullable = false)
    private int internshipExperienceDay;


    @OneToOne
    @JoinColumn(name = "trainee_id")
    @ToString.Exclude
    private Trainee trainee;

    public Internship(String nameOfInstitute, int internshipExperienceDay) {
        this.nameOfInstitute = nameOfInstitute;
        this.internshipExperienceDay = internshipExperienceDay;
    }
}
