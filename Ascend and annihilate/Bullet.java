// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bullet extends Actor
{

    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if (this != null) {
            if (isTouching(Wall.class)) {
                getWorld().removeObject(this);
            }
        }
    }
}
