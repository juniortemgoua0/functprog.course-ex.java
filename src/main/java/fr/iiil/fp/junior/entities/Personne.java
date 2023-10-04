package fr.iiil.fp.junior.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Personne {
    private String prenom;
    private int age;
}
