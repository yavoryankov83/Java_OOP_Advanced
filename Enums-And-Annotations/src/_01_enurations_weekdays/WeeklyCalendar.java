package _01_enurations_weekdays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyCalendar {

  private List<WeeklyEntry> entries;

  public WeeklyCalendar() {
    this.entries = new ArrayList<>();
  }

  public void addEntry(String weekday, String notes) {
    this.entries.add(new WeeklyEntry(weekday, notes));
  }

  public Iterable<WeeklyEntry> getWeeklyShadule() {
    Collections.sort(this.entries, WeeklyEntry.compare());
    return this.entries;
  }
}
