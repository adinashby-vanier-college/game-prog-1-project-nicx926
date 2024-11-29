import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyBluRifle extends Enemiess
{
    private int hitCounter = 0; 
    /** 
     * Act - do whatever the EnemyBluRifle wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        moveAround();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
        die();
    }
    public EnemyBluRifle()
    {
        accuracyRange = 5;
    }
    public void die()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet !=null)
        hitCounter++;
        getWorld().removeObject(bullet);
        if(hitCounter>=2)
        {
            deadSecurity deadSecurity = new deadSecurity();
            getWorld().removeObject(this);
            getWorld().addObject( new  deadSecurity(), getX(), getY());
        }
    }
}