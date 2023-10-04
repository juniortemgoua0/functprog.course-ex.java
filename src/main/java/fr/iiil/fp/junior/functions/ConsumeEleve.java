package fr.iiil.fp.junior.functions;

import fr.iiil.fp.junior.entities.Eleve;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;


//@Slf4j
public class ConsumeEleve implements Consumer<Eleve> {

    public Logger log = LoggerFactory.getLogger(ConsumeEleve.class);

    @Override
    public void accept(Eleve e) {
        log.info("{}", e);
    }
}