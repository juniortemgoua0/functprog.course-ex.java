package fr.iiil.fp.junior.functions;

import fr.iiil.fp.junior.entities.Eleve;
import fr.iiil.fp.junior.helpers.CsvLinesSerializerFunc;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class EleveCsvLinesSerializerFunc implements CsvLinesSerializerFunc<Eleve> {

    @Override
    public List<Eleve> apply(Stream<String> lines) {
        return lines.map(line -> {
                    String[] parts = line.split(",");
                    if (parts.length == 2) {
                        String nom = parts[0].trim();
                        Double note = Double.parseDouble(parts[1].trim());
                        return new Eleve(nom, note);
                    } else {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Eleve::getNote))
                .toList();
    }
}
