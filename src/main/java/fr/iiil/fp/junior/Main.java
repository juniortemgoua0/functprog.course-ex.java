package fr.iiil.fp.junior;

import fr.iiil.fp.junior.entities.Eleve;
import fr.iiil.fp.junior.entities.Personne;
import fr.iiil.fp.junior.functions.EleveCsvLinesSerializerFunc;
import fr.iiil.fp.junior.functions.PersonneCsvLinesSerializerFunc;
import fr.iiil.fp.junior.helpers.CsvFileReader;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Slf4j
public class Main {
    private static final String PERSONNE_CSV_PATH = "src/main/resources/personnes.csv";
    private static final String ELEVE_CSV_PATH = "src/main/resources/eleves.csv";

    public static void main(String[] args) {


        PersonneCsvLinesSerializerFunc personneCsvLinesSerializer = new PersonneCsvLinesSerializerFunc();
        EleveCsvLinesSerializerFunc eleveCsvLinesSerializer = new EleveCsvLinesSerializerFunc();

        CsvFileReader<Personne> csvFileReaderPersonne = new CsvFileReader<>(PERSONNE_CSV_PATH);
        CsvFileReader<Eleve> csvFileReaderEleve = new CsvFileReader<>(ELEVE_CSV_PATH);

        List<Personne> personnes = csvFileReaderPersonne.apply(personneCsvLinesSerializer);
        List<Eleve> eleves = csvFileReaderEleve.apply(eleveCsvLinesSerializer);

        log.info("{}",personnes);
        log.info("{}",eleves);
    }
}