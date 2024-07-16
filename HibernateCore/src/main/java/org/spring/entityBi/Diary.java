package org.spring.entityBi;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@AllArgsConstructor
@Table(name = "diarys")
@Data
@NoArgsConstructor
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nameOfSchool;
    @Column(nullable = false)
    private String nameOfClas;

    public Diary(String nameOfSchool, String nameOfClas) {
        this.nameOfSchool = nameOfSchool;
        this.nameOfClas = nameOfClas;
    }

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
