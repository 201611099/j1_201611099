package com.sd.dao.v1;

public class DaoMainV1 {
  public static void main(String[] args) {
    PersonDao psDao = new PersonDaoImpl();
    System.out.println("---listing all...");
    for (Person p:psDao.getAllPersons()) {
      System.out.println("reading..."+p.getId()+", "+p.getName());
    }
    
    System.out.println("---updating...");
    Person p = psDao.getAllPersons().get(0);
    p.setName("v1-new");
    psDao.updatePerson(p);
    
    System.out.println("---see if updated...");
    psDao.getPerson(0);
    System.out.println(p.getId()+", "+p.getName());
  }
}