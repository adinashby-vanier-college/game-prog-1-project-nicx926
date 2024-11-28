import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player4 extends Playerss
{
    public int survivorRotation;
    /**
     * Act - do whatever the Player4 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        look();
        move();
        shoot();
        survivorRotation = getRotation();
    }
    public void shoot()
    {
        if(Greenfoot.getMouseInfo() != null)
        {
            if(Greenfoot.getMouseInfo().getButton()==1)
            {
                getWorld().addObject(new Bullet(survivorRotation), getX(),getY());
            }
        }
    }
}
