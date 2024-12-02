import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 *
 */
public class Ray extends Actor
{

    /**
     * Act - do whatever the Ray wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);  // Move the ray forward
        if (isAtEdge()) {
            getWorld().removeObject(this);  // Remove ray if it hits the edge
        }
    }
    
}
