package _04_book_comparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

  @Override
  public int compare(Book book1, Book book2) {
    int result = book1.getTitle().compareTo(book2.getTitle());
    if (result == 0) {
      return Integer.compare(book1.getAge(), book2.getAge());
    }

    return result;
  }
}
