package fr.iiil.fp.junior.helpers;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public interface CsvLinesSerializerFunc<T> extends Function<Stream<String>, List<T>> {
}
