package _03_generic_scale;

public class Scale<T extends Comparable<T>> {

  private T leftElement;
  private T rightElement;

  public Scale(T leftElement, T rightElement) {
    this.setLeftElement(leftElement);
    this.setRightElement(rightElement);
  }

  public T getLeftElement() {
    return this.leftElement;
  }

  public void setLeftElement(T leftElement) {
    this.leftElement = leftElement;
  }

  public T getRightElement() {
    return this.rightElement;
  }

  public void setRightElement(T rightElement) {
    this.rightElement = rightElement;
  }

  public T GetHavier() {
    if (this.leftElement.compareTo(this.rightElement) > 0) {
      return this.leftElement;
    } else if (this.leftElement.compareTo(this.rightElement) < 0) {
      return this.rightElement;
    } else {
      return null;
    }
  }
}
