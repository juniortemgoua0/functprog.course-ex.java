package fr.iiil.fp.junior.functions;

import fr.iiil.fp.junior.entities.Eleve;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

import static org.mockito.Mockito.*;

class ConsumeEleveTest {

    private ConsumeEleve consumeEleve;
    private Logger mockLogger;

    @BeforeEach
    void setUp() {
        consumeEleve = new ConsumeEleve();
        mockLogger = mock(Logger.class);
        consumeEleve.log = mockLogger;
    }

    @Test
    public void shouldLogEleveInfo(){
        Eleve eleve = new Eleve("Junior Temgoua", 19.0);
        consumeEleve.accept(eleve);
        verify(mockLogger, times(1)).info("{}",eleve);
    }

    @Test
    public void shouldLogEleveInfoMultipleTime(){
        Eleve eleve = new Eleve("Junior Temgoua", 19.0);
        Eleve eleve2 = new Eleve("Browdon Temgoua", 18.0);

        consumeEleve.accept(eleve);
        consumeEleve.accept(eleve2);

        verify(mockLogger, times(1)).info("{}",eleve);
        verify(mockLogger, times(1)).info("{}",eleve2);
    }
}