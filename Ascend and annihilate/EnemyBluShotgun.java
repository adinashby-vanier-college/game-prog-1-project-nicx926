import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyBluShotgun extends Enemiess
{
    private int hitCounter = 0;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
        die();
    }
    public EnemyBluShotgun()
    {
        accuracyRange = 10;
        
    }
    public void die(){
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet !=null)
        hitCounter++;
        getWorld().removeObject(bullet);
        if(hitCounter>=2)
        {
            deadSecurity deadSecurity = new deadSecurity();
            getWorld().addObject(deadSecurity, getX(), getY());
            getWorld().removeObject(this);
        }
    }
}
