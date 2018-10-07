package p01_system_resources;

import java.time.LocalTime;

public class TimeProviderImpl implements TimeProvider {
  @Override
  public int getCurrentHour() {
    return LocalTime.now().getHour();
  }
}
