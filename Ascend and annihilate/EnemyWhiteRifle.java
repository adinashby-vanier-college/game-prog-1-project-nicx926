import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyWhiteRifle extends Enemiess
{   
    private int hitCounter = 0;
    /**
     * Act - do whatever the EnemyWhiteRifle wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        moveAround();
        lookForPlayerAndShoot();
        manageCooldown();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
        die();
    }
    public EnemyWhiteRifle()
    {   
        this.accuracyRange = 5;
        this.cooldownTime = 30; 
        this.shootingRange = 400;
    }
    public void die()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet !=null)
        hitCounter++;
        getWorld().removeObject(bullet);
        if(hitCounter>=1)
        {
            deadWorker deadWorker = new deadWorker();
            getWorld().removeObject(this);
            getWorld().addObject( new  deadWorker(), getX(), getY());
        }
    }
}
