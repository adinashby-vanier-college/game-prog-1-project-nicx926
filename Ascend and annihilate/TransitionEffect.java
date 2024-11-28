import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * this actor is in charge of the fading in and fading out between levels
 */
public class TransitionEffect extends Actor
{
    private int transparency = 0; //starting transparency (fully transparent)
    private int fadeSpeed = 5; 
    private boolean fadingOut = true; //start with fading out
    private World nextWorld; //the world to transition to

    /**
     * 
     */
    public TransitionEffect(int width, int height, World nextWorld)
    {
        this.nextWorld = nextWorld;
        /* this part creates a black rectangle covering the screen*/
        GreenfootImage image =  new  GreenfootImage(width, height);
        image.setColor(Color.BLACK);
        image.fill();
        setImage(image);
        getImage().setTransparency(transparency);
    }

    /**
     * Act - do whatever the TransitionActor wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (fadingOut) {
            transparency += fadeSpeed; //increase the transparency
            if (transparency >= 255) { // fully opaque
                transparency = 255;
                fadingOut = false; //this switch to fade in
                Greenfoot.setWorld(nextWorld); //transition to the next world
            }
        }else{
            transparency -= fadeSpeed; //decrease the transparency
            if(transparency <= 0){//fully transparent
                transparency = 0;
                getWorld().removeObject(this);//remove transition effect actor
            }
    
        }
        getImage().setTransparency(transparency); //Apply the transparency
    }
}
