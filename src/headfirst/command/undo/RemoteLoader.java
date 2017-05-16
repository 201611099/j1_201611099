package headfirst.command.undo;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
    Light livingRoomLight = new Light("Living Room");
    DVD dvd = new DVD("DVD control");
    
    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    
    DVDOnCommand dvdOn = new DVDOnCommand(dvd);
    DVDOffCommand dvdOff = new DVDOffCommand(dvd);
    
    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(0, dvdOn, dvdOff);
    
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    System.out.println(remoteControl);
    
    remoteControl.undoButtonWasPushed();
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(0);
    System.out.println(remoteControl);
    
    remoteControl.undoButtonWasPushed();
  }
}