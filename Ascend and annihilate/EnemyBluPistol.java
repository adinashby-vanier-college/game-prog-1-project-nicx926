import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyBluPistol extends Enemiess
{
    private int hitCounter = 0; 
    /**
     * Act - do whatever the EnemyBluPistol wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
    public EnemyBluPistol()
    {
        accuracyRange = 30;
    }
    public void die()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet !=null){
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
}