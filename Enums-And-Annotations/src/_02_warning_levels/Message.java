package _02_warning_levels;

public class Message {

  private String message;
  private Importance importance;

  public Message(String importance, String message) {
    this.setMessage(message);
    this.setImportance(Enum.valueOf(Importance.class, importance.toUpperCase()));
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Importance getImportance() {
    return this.importance;
  }

  public void setImportance(Importance importance) {
    this.importance = importance;
  }

  @Override
  public String toString() {
    return String.format("%s: %s", this.importance.name().toUpperCase(), this.message);
  }
}
