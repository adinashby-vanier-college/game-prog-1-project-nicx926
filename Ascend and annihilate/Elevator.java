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
         Playerss player = (Playerss) getOneIntersectingObject(Playerss.class);
         if (player != null){
             // This checks which world to transition to based on the player.
            levelTransition(getNextWorld(player));
         }
    }
    
    public World getNextWorld(Playerss player){
        if (player instanceof Player2) {
            return new LTwoWorld();  // Transition to Level 2
        }
        else if (player instanceof Player3) {
            return new LThreeWorld();  // Transition to Level 3
        }
        else if (player instanceof Player4) {
            return new BossWorld();  // Transition to boss level
        }
        // Add more conditions for other players if needed
        return null;  // Return null if no valid transition is found
    }
    
    public void levelTransition(World nextWorld){
        if(!transitioning && nextWorld != null){
            transitioning = true; //prevent multiple triggers
            
            //creating a transition actor for fading
            World currentWorld = getWorld();
             
            TransitionEffect transition = new TransitionEffect(currentWorld.getWidth(), currentWorld.getHeight(),nextWorld);
            //add the TransitionActor to the center of the screen
            currentWorld.addObject(transition, currentWorld.getWidth() / 2, currentWorld.getHeight() / 2);
        }
    }
}
