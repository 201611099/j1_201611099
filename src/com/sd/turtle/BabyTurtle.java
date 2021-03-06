package com.sd.turtle;

import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D.Double;

public class BabyTurtle extends Observable {
  Turtle baby;
  ArrayList<Observer> obs;
  Double myCurpos;
  public BabyTurtle() {
    baby = new Turtle();
    obs = new ArrayList<Observer>();
  }
  public void addObserver(Observer o) {
    obs.add(o);
  }
  public void notifyObservers(){
    for(Observer o:obs)
      o.update(this, 1);
  }
  protected void setChanged(){
    myCurpos = baby.getPos();
  }
  public void move(int x, int y) {
    baby.moveTo(x,y);
  }
}