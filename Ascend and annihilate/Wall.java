import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Wall extends Actor
{
    public Wall(String orientation, int length) {
        setWallSize(orientation, length);
    }

    // Method to set the wall size dynamically
    public void setWallSize(String orientation, int length) {
        GreenfootImage image = getImage(); // Retrieve the current image
        int wallThickness = 6; // thickness for walls
        
        if (orientation.equalsIgnoreCase("horizontal")) {
            image.scale(length, wallThickness); // Scale width to length, height to thickness
            //setLocation(getX() - (length / 2), getY()); // Adjust the position so it stretches from the left side
        } else if (orientation.equalsIgnoreCase("vertical")) {
            image.scale(wallThickness, length); // Scale width to thickness, height to length
            //setLocation(getX(), getY() - (length / 2)); // Adjust the position so it stretches from the top
        } else {
            System.out.println("Invalid orientation! Use 'horizontal' or 'vertical'.");
        }
    }
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
}
