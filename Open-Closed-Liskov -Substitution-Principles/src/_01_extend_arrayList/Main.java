package _01_extend_arrayList;

import java.util.Collections;

public class Main {
  public static void main(String[] args) {

    ExtendedArrayList<Integer> list = new ExtendedArrayList<>();
    Collections.addAll(list, 3, 5, 9, 7, 54, -3);

    System.out.println(list.min());
    System.out.println(list.max());
  }
}
