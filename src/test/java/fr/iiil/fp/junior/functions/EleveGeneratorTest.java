package fr.iiil.fp.junior.functions;

import fr.iiil.fp.junior.entities.Eleve;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EleveGeneratorTest {

    @Test
    public void canGenerateEleve() {
        EleveGenerator eleveGenerator = new EleveGenerator("Junior");
        Eleve result = eleveGenerator.get();

        assertEquals("Junior", result.getNom());
        assertTrue(result.getNote() >= 0.0 && result.getNote() <= 20.0);
    }

}