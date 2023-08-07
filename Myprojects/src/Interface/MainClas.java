package Interface;

interface Camera{
    void printMessage();
}


class DigitalCamera implements Camera{
   public void  printMessage(){
        System.out.print("Taking a picture on my digital camera!");
    }
}

class PolaroidCamera implements Camera
{
	public  void  printMessage(){
        System.out.print("Taking a picture on my Polaroid camera!");
    }
}
class PhoneCamera implements Camera
{
	public void printMessage(){
        System.out.print("Taking a picture on my Phone camera!");
    }
}
public class MainClas{
public static void main (String[] args) {
    
    DigitalCamera camera = new DigitalCamera();
    camera.printMessage();
}
    
} bbgvh n bhn bhn