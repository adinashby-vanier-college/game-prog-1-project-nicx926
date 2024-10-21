// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player extends Actor
{

    /**
     * 
     */
    public void act()
    {
        look();
        move();
        swing();
    }

    /**
     * Act - do whatever the Player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void look()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            turnTowards(mouse.getX(), mouse.getY());
        }
    }

    /**
     * 
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 2, getY());
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 2);
        }
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 2, getY());
        }
        if (Greenfoot.isKeyDown("mouse1")) {
            setLocation(getX() + 2, getY());
        }
    }

    /**
     * 
     */
    public void swing()
    {
        if (Greenfoot.mouseClicked(null)) {
            swingBat();
        }
    }

    /**
     * 
     */
    private void swingBat()
    {
        int direction = getRotation();
        List<Actor> actorsInRange = getObjectsInRange(60, Actor.class);
        for (final Actor actor : actorsInRange) {
            if (actor != this) {
                int angleToActor = (int)Math.toDegrees(Math.atan2(actor.getY() - getY(), actor.getX() - getX()));
                int angleDifference = Math.abs((angleToActor - direction + 360) % 360);
                if ((angleDifference <= 40 || angleDifference >= (360 - 20))) {
                    getWorld().removeObject(actor);
                }
            }
        }
    }
}
