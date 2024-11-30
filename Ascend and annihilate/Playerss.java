import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Playerss extends Characters
{
    private int health = 3;
    
    public Playerss(){
        GreenfootImage image = getImage();
        // Define your scaling factor (e.g., 1.5 means 150% of the original size)
        double scaleFactor = 0.9;
        
        // Calculate new width and height using the scale factor
        int newWidth = (int)(image.getWidth() * scaleFactor);
        int newHeight = (int)(image.getHeight() * scaleFactor);
        
        // Scale the image to the new dimensions
        image.scale(newWidth, newHeight);
        
        // Set the scaled image
        setImage(image);
    }
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
        EnemyBullet enemyBullet = (EnemyBullet) getOneIntersectingObject(EnemyBullet.class);
        if (enemyBullet != null) {
            takeDamage(); // Reduce health
            getWorld().removeObject(enemyBullet); // Remove the bullet
        }
    }
    public void takeDamage()
    {
        health--;
        if (health <= 0) {
                die();
            }
    }
    public void die()
    {
        Greenfoot.setWorld(new GameOverWorld()); // Transition to GameOverWorld
        deadPlayer deadPlayer = new deadPlayer();
        getWorld().addObject(deadPlayer,getX(),getY());
        getWorld().removeObject(this); // Remove the player from the world
    }
    }

