import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Playerss extends Characters
{
    private int health = 3;
    /**
     * Act - do whatever the Playerss wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        look();
        move();
        checkIfHit();
    }

    /**
     * 
     */
    public void move()
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
     * Act - do whatever the Player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void look()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            turnTowards(mouse.getX(), mouse.getY());
        }
    }
    public void checkIfHit()
    {
        Bullet bullet = (Bullet) getOneIntersectingObject(Bullet.class);
        if (bullet != null) {
            health--; // Reduce health
            getWorld().removeObject(bullet); // Remove the bullet

            if (health <= 0) {
                die();
            }
        }
    }
    public void die()
    {
        Greenfoot.setWorld(new GameOverWorld()); // Transition to GameOverWorld
        getWorld().removeObject(this); // Remove the player from the world
        
    }
    }

