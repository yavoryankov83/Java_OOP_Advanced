package _01_reflection;

public class Audi implements Rentable {

  private Integer minRentDay;
  private Double pricePerDay;
  private String countryProduced;
  private String model;
  private String color;
  private Integer horsePower;

  public Audi(String model) {
    this.model = model;
  }

  public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
    this.setModel(model);
    this.setColor(color);
    this.setHorsePower(horsePower);
    this.setCountryProduced(countryProduced);
    this.setMinRentDay(minRentDay);
    this.setPricePerDay(pricePerDay);
  }

  public Integer getMinRentDay() {
    return this.minRentDay;
  }

  public void setMinRentDay(Integer minRentDay) {
    this.minRentDay = minRentDay;
  }

  public Double getPricePerDay() {
    return this.pricePerDay;
  }

  public void setPricePerDay(Double pricePerDay) {
    this.pricePerDay = pricePerDay;
  }

  public String getCountryProduced() {
    return this.countryProduced;
  }

  public void setCountryProduced(String countryProduced) {
    this.countryProduced = countryProduced;
  }

  @Override
  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public Integer getHorsePower() {
    return this.horsePower;
  }

  public void setHorsePower(Integer horsePower) {
    this.horsePower = horsePower;
  }

  @Override
  public String toString() {
    return String.format(
            "This is %1$s produces in %2$s and have %3$d tyres"
            , this.getModel()
            , this.getCountryProduced()
            , TYRES);
  }
}
