import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyWhiteSmg extends Enemiess
{
    private int hitCounter = 0;
    /**
     * Act - do whatever the EnemyWhiteShotgun wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        moveAround();
        if (canSeePlayer()) { // Check line of sight before shooting
            lookForPlayerAndShoot();
        }
        manageCooldown();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
        die();
    }
    public EnemyWhiteSmg()
    {
        this.accuracyRange = 10;
        this.cooldownTime = 20;
        this.shootingRange = 200;
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
            getWorld().addObject(deadWorker, getX(), getY());
            getWorld().removeObject(this);
        }
    }
}