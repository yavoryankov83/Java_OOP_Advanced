package _04_book_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {

  private String title;
  private int age;
  private List<String> authors;

  public Book(String title, int age, String... authors) {
    this.setTitle(title);
    this.setAge(age);
    this.setAuthors(new ArrayList<>());

    Collections.addAll(this.getAuthors(), authors);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public List<String> getAuthors() {
    return authors;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    builder.append("Title: ")
            .append(this.getTitle())
            .append(" Year: ")
            .append(this.getAge())
            .append(" Authors: ")
            .append(String.join(", ", this.getAuthors()));
    return builder.toString();
  }

  @Override
  public int compareTo(Book book) {
    int result = this.title.compareTo(book.title);
    if (result != 0) {
      return result;
    } else {
      return Integer.compare(this.age, book.age);
    }
  }
}
