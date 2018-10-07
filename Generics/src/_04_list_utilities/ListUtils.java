package _04_list_utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtils {

  public static <T extends Comparable<T>> T getMin(List<T> list) {
    if (list.isEmpty()) {
      throw new IllegalArgumentException("List is enpty");
    } else {
      return list.stream().min((x, y) -> x.compareTo(y)).get();
    }
  }

  public static <T extends Comparable<T>> T getMax(List<T> list) {
    if (list.isEmpty()) {
      throw new IllegalArgumentException("List is enpty");
    } else {
      return list.stream().max((x, y) -> x.compareTo(y)).get();
    }
  }

  public static List<Integer> getNullIndices(List<?> list) {
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == null) {
        result.add(i);
      }
    }

    return result;
  }

  public static <T> void flatten(List<? super T> destination, List<List<? extends T>> sourse) {
    for (List<? extends T> list : sourse) {
      destination.addAll(list);
    }
  }

  public static <T> void addAll(List<? super T> destination, List<? extends T> sourse) {
    destination.addAll(sourse);
  }
}
