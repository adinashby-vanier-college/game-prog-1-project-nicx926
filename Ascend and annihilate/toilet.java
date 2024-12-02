 import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class toilet extends decorations
{
    public toilet(){
        GreenfootImage image = getImage();
        image.rotate(90);
        setImage(image);
    }
    /**
     * Act - do whatever the toilet wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        removeBullet();
    }
}
