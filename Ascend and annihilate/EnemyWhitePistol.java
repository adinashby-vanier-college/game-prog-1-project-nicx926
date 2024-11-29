import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyWhitePistol extends Enemiess
{
    private int hitCounter = 0;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
    public EnemyWhitePistol()
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
            deadWorker deadWorker = new deadWorker();
            getWorld().removeObject(this);
            getWorld().addObject(deadWorker, getX(), getY());
        }
        }
    }
}
    
    

