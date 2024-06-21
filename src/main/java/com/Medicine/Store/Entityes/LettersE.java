package com.Medicine.Store.Entityes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "letters")
public class LettersE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "LETTER")
    private String letter;
    @Column(name = "SOTK_LOCATION")
    private String sockLocation;

}
