package com.sd.dao.v2;

import java.util.*;

public class DaoMainV2 {
  public static void main(String args[]) {
    PersonDaoImpl pDI = new PersonDaoImpl();
    PersonV0 p = new PersonV0();
    
    p.setName("js1");
    p.setAddress("1 Hongji-dong");
    pDI.insert(p);
    
    p.setName("js2");
    p.setAddress("2 Hongji-dong");
    pDI.insert(p);
    
    List<PersonV0> persons = pDI.findAll();
    Iterator iter = persons.iterator();
    while(iter.hasNext()) {
      p=(PersonV0)iter.next();
      System.out.println(p.toString());
    }
    
    pDI.delete(1);
    
    p.setId(2);
    p.setName("js2 updated");
    p.setAddress("2 Hongji-dong updated");
    pDI.update(p);
    
    p=pDI.findById(2);
    System.out.println("found by id..." + p);
    
    pDI.close();
  }
}