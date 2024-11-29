import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 *
 */
public class Fireball extends Actor
{

    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);  // Move the fireball forward
        if (isAtEdge()) {
            getWorld().removeObject(this);  // Remove fireball if it hits the edge
        }
    }
}   