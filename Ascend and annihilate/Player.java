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
    public void checkIfHitByEnemy()
    {
        Enemy enemy = (Enemy)getOneIntersectingObject(Enemy.class);
        if (enemy != null) {
            die();
        }
    }

    /**
     * 
     */
    public void die()
    {
        getWorld().addObject( new deadPlayer(), getX(), getY());
        getWorld().removeObject(this);
    }

    /**
     * 
     */
    private void move()
    {
        int dx = 0;
        int dy = 0;
        if (Greenfoot.isKeyDown("a")) {
            dx = -2;
        }
        if (Greenfoot.isKeyDown("d")) {
            dx = 2;
        }
        if (Greenfoot.isKeyDown("w")) {
            dy = -2;
        }
        if (Greenfoot.isKeyDown("s")) {
            dy = 2;
        }
        /* Store current position*/
        int newX = getX() + dx;
        int newY = getY() + dy;
        /* Set the new position temporarily*/
        setLocation(newX, newY);
        /* Check for collision after moving*/
        if (isTouching(Wall.class)) {
            /* If touching a wall, revert back to the original position*/
            setLocation(getX() - dx, getY() - dy);
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
            if (actor != this && actor instanceof Enemy) {
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
