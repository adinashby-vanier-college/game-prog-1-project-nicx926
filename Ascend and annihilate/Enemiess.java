import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemiess extends Characters
{
    protected int accuracyRange;
    public int survivorRotation;
    int shootCooldown = 0;
    int reloadTime = 100;
    int burstShotsLeft = 3;
    
    public Enemiess(){
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
     * Act - do whatever the Enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        moveAround();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }
    /**
     * 
     */
    public void move()
    {
        //int dx = 0;
        //int dy = 0;
        //if (isTouching(Wall.class)) {
            //dx = -2;
        //}
        //if (isTouching(Wall.class)) {
            //dx = 2;
        //}
        //if (isTouching(Wall.class)) {
            //dy = -2;
        //}
        //if (isTouching(Wall.class)) {
            //dy = 2;
        //}
        /* Store current position*/
        // newX = getX() + dx;
        //int newY = getY() + dy;
        /* Set the new position temporarily*/
        //setLocation(newX, newY);
        /* Check for collision after moving*/
        if (isTouching(Wall.class)) {
            /* If touching a wall, revert back to the original position*/
            //setLocation(getX() - dx, getY() - dy);
            move(-1);
            turn(180);
        }
    }
    /**
     * 
     */
    public void moveAround()
    {
        move(1);
        if ((Greenfoot.getRandomNumber(10) == 1)) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }
    /**
     * 
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Playerss.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * 
     */
    public void transitionToGameOverWorld()
    {
        World GameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(GameOverWorld);
    }
}
