import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Exit extends Elevator
{
    public Exit(){
        GreenfootImage image = getImage();
        // Define your scaling factor (e.g., 1.5 means 150% of the original size)
        double scaleFactor = 0.29;
        
        // Calculate new width and height using the scale factor
        int newWidth = (int)(image.getWidth() * scaleFactor);
        int newHeight = (int)(image.getHeight() * scaleFactor);
        
        // Scale the image to the new dimensions
        image.scale(newWidth, newHeight);
        
        // Set the scaled image
        setImage(image);
    }
    /**
     * Act - do whatever the exit wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
}
