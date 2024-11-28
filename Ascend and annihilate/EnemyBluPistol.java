import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyBluPistol extends Enemiess
{
    
    /**
     * Act - do whatever the EnemyBluPistol wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        moveAround();
        lookForPlayers();
        manageCooldown();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
        die();
    }
    public EnemyBluPistol()
    {
        maxShots = 3;
        accuracyRange = 30;
    }
    public void die()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet !=null)
        {
            getWorld().removeObject(bullet);
            getWorld().removeObject(this);
        }
    }
}
