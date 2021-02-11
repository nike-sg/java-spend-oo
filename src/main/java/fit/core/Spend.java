package fit.core;

import java.util.Date;

public class Spend {
  private String name;
  private Date date;
  private double value;

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date newDate) {
    this.date = newDate;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double newValue) {
    this.value = newValue;
  }

  
}
