package assignment.week6.address;

import java.util.*;

public class AddressData implements Subject {
  private ArrayList<Observer> observers;
  private String name;
  private String phone;
  private String email;
  
  public AddressData() {
    observers = new ArrayList<Observer>();
  }
  
  public void registerObserver(Observer o) {
    observers.add(o);
  }
  
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }
  
  public void notifyObservers() {
    for (int i = 0 ; i < observers.size(); i++) {
      Observer observer = (Observer)observers.get(i);
      observer.update(name, phone, email);
    }
  }
  
  public void measurementsChanged() {
    notifyObservers();
  }
  
  public void setMeasurements(String name, String phone, String email) {
    this.name = name;
    this.phone = phone;
    this.email = email;
    measurementsChanged();
  }
  
  public String getName() {
    return name;
  }
  public String getPhone() {
    return phone;
  }
  public String getEmail() {
    return email;
  }
}