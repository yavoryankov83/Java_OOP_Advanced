package _04_list_utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Integer> nums = new ArrayList<>();
    Collections.addAll(nums, 1, 2, 18, -1);

    System.out.println(ListUtils.getMin(nums));
    System.out.println(ListUtils.getMax(nums));

    List<Integer> nums1 = new ArrayList<>();
    Collections.addAll(nums1, 1, null, 18, null);

    System.out.println(ListUtils.getNullIndices(nums1));

    List<Integer> ints = new ArrayList<>();
    Collections.addAll(ints, 4, 5, 8, 6);

    List<Double> dobs = new ArrayList<>();
    Collections.addAll(dobs, 5.4, 5.4);

    List<List<? extends Number>> mixed = new ArrayList<>();
    Collections.addAll(mixed, ints, dobs);

    List<Number> dest = new ArrayList<>();
    ListUtils.flatten(dest, mixed);

    System.out.println(dest);
  }
}
