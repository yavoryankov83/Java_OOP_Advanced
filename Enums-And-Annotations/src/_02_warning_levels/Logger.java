package _02_warning_levels;

import java.util.ArrayList;
import java.util.List;

public class Logger {

  private List<Message> messages;
  private Importance importanceLevel;

  public Logger(String importanceLevel) {
    this.setMessages(new ArrayList<>());
    this.setImportanceLevel(Enum.valueOf(Importance.class, importanceLevel.toUpperCase()));
  }

  public List<Message> getMessages() {
    return this.messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  public Importance getImportanceLevel() {
    return this.importanceLevel;
  }

  public void setImportanceLevel(Importance importanceLevel) {
    this.importanceLevel = importanceLevel;
  }

  public void addMessage(String importance, String message) {
    Importance imp = Enum.valueOf(Importance.class, importance.toUpperCase());
    if (imp.compareTo(this.importanceLevel) >= 0) {
      this.messages.add(new Message(importance, message));
    }
  }

  public Iterable<Message> getMessage() {
    return this.messages;
  }
}
