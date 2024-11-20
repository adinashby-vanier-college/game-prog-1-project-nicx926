import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player1 extends Playerss
{

    /**
     * 
     */
    public void act()
    {
        swing();
        look();
        move();
    }

    /**
     * 
     */
    public void checkIfHitByEnemy()
    {
        Enemiess enemy = (Enemiess)getOneIntersectingObject(Enemiess.class);
        if (enemy != null) {
            die();
        }
    }

    /**
     * 
     */
    public void die()
    {
        getWorld().addObject( new  deadPlayer(), getX(), getY());
        getWorld().removeObject(this);
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
            if (actor != this && actor instanceof Enemiess) {
                /* Check if the actor is an instance of Enemy*/
                int angleToActor = (int)Math.toDegrees(Math.atan2(actor.getY() - getY(), actor.getX() - getX()));
                int angleDifference = Math.abs((angleToActor - direction + 360) % 360);
                if ((angleDifference <= 40 || angleDifference >= (360 - 20))) {
                    getWorld().removeObject(actor);
                }
            }
        }
    }
}
