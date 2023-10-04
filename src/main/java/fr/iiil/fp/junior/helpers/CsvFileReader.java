package fr.iiil.fp.junior.helpers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

@Slf4j
@AllArgsConstructor
public class CsvFileReader<T> implements Function<CsvLinesSerializerFunc<T>, List<T>> {
    private String path;

    @Override
    public List<T> apply(CsvLinesSerializerFunc<T> function) {
        List<T> result = new ArrayList<>();
        Optional<Path> optFilePath = Optional.of(Paths.get(this.path));
        Path filePath;
        if (!optFilePath.isPresent())
            return result;
        filePath = optFilePath.get();
        try {
            Stream<String> lines = Files.lines(filePath)
                    .skip(1);

            result = function.apply(lines);

        } catch (IOException e) {
            if (e instanceof NoSuchFileException)
                log.error("Le fichier n'a pas été retrouvé, rassurez-vous que ce chemin {} est valide", e.getMessage(), e);
            else
                log.error("Une erreur s'est produite", e);
        }
        return result;
    }
}
