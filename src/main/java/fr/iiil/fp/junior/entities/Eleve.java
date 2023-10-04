package fr.iiil.fp.junior.entities;

import lombok.*;

@AllArgsConstructor
@ToString
@Getter
public class Eleve {
    private String nom;
    @Setter
    private Double note;
}
