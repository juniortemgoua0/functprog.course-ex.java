package fr.iiil.fp.junior.functions;

import fr.iiil.fp.junior.entities.Eleve;
import lombok.AllArgsConstructor;

import java.util.Random;
import java.util.function.Supplier;

@AllArgsConstructor
public class EleveGenerator implements Supplier<Eleve> {
    private String nom;

    @Override
    public Eleve get() {
        Random r = new Random();
        return new Eleve(this.nom, r.nextDouble(0.0, 20.0));
    }
}
