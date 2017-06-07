package assignment.week14.address;

import java.util.List;

public interface AddressDAO {
  public void insert (Address a);
  public List<Address> findAll();
  public Address findById(int id);
  public void update(Address a);
  public void delete(int id);
}