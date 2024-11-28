import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bullet extends Actor
{
    public int speed = 5;
    private boolean firedByPlayer;
    
    public Bullet(boolean firedByPlayer)
    {
        this.firedByPlayer = firedByPlayer;
    }
    public boolean getFiredByPlayer()
    {
        return firedByPlayer;
    }
    public Bullet(int rotation)
    {
        setRotation(rotation);
    }
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        remove();
    }
    public void remove()
    {
        
        if (isTouching(Wall.class) || isAtEdge())
        {
            getWorld().removeObject(this);
        }
    
    }
}
