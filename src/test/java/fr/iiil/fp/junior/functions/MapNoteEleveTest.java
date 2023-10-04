package fr.iiil.fp.junior.functions;

import fr.iiil.fp.junior.entities.Eleve;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapNoteEleveTest {

    @Test
    public void shouldMapEleveNote(){
        MapNoteEleve mapNoteEleve = new MapNoteEleve();
        Eleve eleve = new Eleve("Junior Temgoua", 13.0);

        Double result = mapNoteEleve.apply(eleve);
        assertEquals(eleve.getNote(), result);
    }
}