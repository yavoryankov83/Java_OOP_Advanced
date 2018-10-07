package _01_enurations_weekdays;

import java.util.Comparator;

public class WeeklyEntry {

  private Weekday weekday;
  private String notes;

  public WeeklyEntry(String weekday, String notes) {
    this.setWeekday(Enum.valueOf(Weekday.class, weekday.toUpperCase()));
    this.setNotes(notes);
  }

  public Weekday getWeekday() {
    return this.weekday;
  }

  public void setWeekday(Weekday weekday) {
    this.weekday = weekday;
  }

  public String getNotes() {
    return this.notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  @Override
  public String toString() {
    return String.format("\"%s - %s\"", this.getWeekday(), this.getNotes());
  }

  static Comparator<WeeklyEntry> compare() {
    return (e1, e2) -> e1.weekday.ordinal() - e2.weekday.ordinal();
  }
}
