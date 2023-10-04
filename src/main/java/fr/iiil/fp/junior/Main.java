package fr.iiil.fp.junior;

import fr.iiil.fp.junior.entities.Personne;
import fr.iiil.fp.junior.functions.PersonneCsvLinesSerializerFunc;
import fr.iiil.fp.junior.helpers.CsvFileReader;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Slf4j
public class Main {
    public static void main(String[] args) {
//        Eleve eleve = new Eleve("Junior", 12.0);
//
//        ConsumeEleve consumeEleve = new ConsumeEleve();
//        consumeEleve.accept(eleve);
//
//        EleveGenerator eleveGenerator = new EleveGenerator("Pharex");
//        Eleve result = eleveGenerator.get();
//
//        MapNoteEleve mapNoteEleve = new MapNoteEleve();
//        Double note = mapNoteEleve.apply(eleve);

        //Recuperation et serialization depuis le fichier CSV
        PersonneCsvLinesSerializerFunc personneCsvLinesSerializer = new PersonneCsvLinesSerializerFunc();
        CsvFileReader<Personne> csvFileReader = new CsvFileReader<>("src/main/resources/personnes.csv");

        List<Personne> personnes = csvFileReader.apply(personneCsvLinesSerializer);
        log.info("{}",personnes);
    }
}