package es.geekshubs.academy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.stream.IntStream;

import static java.lang.Double.isNaN;

public class Salto {

  /**
   * Apply Method
   * @param input
   * @return
   */
  public int apply(final List<Integer> input) {
    if (input == null || input.isEmpty()) {
      return -1;
    }

    Integer[] integerArray = input.toArray(new Integer[0]);

    List<Integer> filteredEvenPosition = new ArrayList<>();
    IntStream.range(0, integerArray.length).filter(i ->  i % 2 == 0).forEach(i -> filteredEvenPosition.add(integerArray[i]));

    return filteredEvenPosition.stream().reduce(1, (a, b) -> a * b);
  }


}
