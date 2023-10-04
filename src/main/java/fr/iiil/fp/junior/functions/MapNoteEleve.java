package fr.iiil.fp.junior.functions;

import fr.iiil.fp.junior.entities.Eleve;

import java.util.function.Function;

public class MapNoteEleve implements Function<Eleve, Double> {
    @Override
    public Double apply(Eleve eleve) {
        return eleve.getNote();
    }
}
