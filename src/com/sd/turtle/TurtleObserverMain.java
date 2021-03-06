package com.sd.turtle;

import ch.aplu.turtle.*;
import java.awt.geom.Point2D.Double;
import java.util.Observable;
import java.util.Observer;

public class TurtleObserverMain {
  public static void main(String[] args) {
    BabyTurtle baby = new BabyTurtle();
    MomTurtle mom = new MomTurtle();
    baby.addObserver(mom);
    mom.moveTo(100,100);
    baby.move(100,-100);
    baby.setChange();
    baby.notifyObservers();
  }
}