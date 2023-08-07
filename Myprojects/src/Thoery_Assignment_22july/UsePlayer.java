package Thoery_Assignment_22july;
/*
 * Create an interface called Player. The interface has an abstract method called play() that
displays a message describing the meaning of “play” to the class. Create classes called Child,
Musician, and Actor that all implement Player. Create an application that demonstrates the
use of the classes(UsePlayer.java)
 */
interface Player 
{
    public void play();
}
 class Child implements Player
{
    public void play()
    {
        System.out.println("I am a child that plays with toys.");
    }
}

class Musician implements Player
{
    public void play()
    {
        System.out.println("I am a musician that plays on a musical instrument.");
    }
}
 class Actor implements Player
{
    public void play()
    {
        System.out.println("I am an actor that plays a part in a drama.");
    }
}

public class UsePlayer {

	public static void main(String[] args) {
		
		Child aChild = new Child();
        Actor anActor = new Actor();
        Musician aMusician = new Musician();
        
        aChild.play();
        anActor.play();
        aMusician.play();
	}

}
