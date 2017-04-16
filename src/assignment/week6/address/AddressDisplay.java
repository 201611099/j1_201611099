package assignment.week6.address;

public class AddressDisplay implements Observer, DisplayElement {
  private String name;
  private String phone;
  private String email;
  private AddressData addressData;
  
  public AddressDisplay(AddressData addressData) {
    this.addressData = addressData;
    addressData.registerObserver(this);
  }
  
  public void update(String name, String phone, String email) {
    this.name = name;
    this.phone = phone;
    this.email = email;
    display();
  }
  
  public void display() {
    System.out.println(name + phone + email);
  }
}