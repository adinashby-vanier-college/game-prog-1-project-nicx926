import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Elevator extends Actor
{
    private boolean transitioning = false;
    /**
     * constructor for rotating and for scaling down the image
     */
    public Elevator()
    {
        GreenfootImage image = getImage();
        image.rotate(180);
        image.scale(image.getWidth() / 2, image.getHeight() / 2);
        setImage(image);
    }

    /**
     * Act - do whatever the Elevator wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Player1 player = (Player1) getOneIntersectingObject(Player1.class);
        
        if(!transitioning && player != null){
            transitioning = true; //prevent multiple triggers
            
            //creating a transition actor for fading
            /*these 5 lines of code aligns the position of player and elevator
            of level 1 to level 2*/
            World currentWorld = getWorld();
            //int playerX = player.getX();
            //int playerY = player.getY();
            //int elevatorX = getX();
            //int elevatorY = getY();
            
        
            LTwoWorld nextWorld = new LTwoWorld(); 
            TransitionEffect transition = new TransitionEffect(currentWorld.getWidth(), currentWorld.getHeight(),nextWorld);
            //add the TransitionActor to the center of the screen
            currentWorld.addObject(transition, currentWorld.getWidth() / 2, currentWorld.getHeight() / 2);
        }
    }
}
