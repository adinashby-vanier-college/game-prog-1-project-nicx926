import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyBluRifle extends Enemiess
{

    /**
     * Act - do whatever the EnemyBluRifle wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
    public EnemyBluRifle()
    {
        maxShots = 10;
        accuracyRange = 5;
    }
    public void die()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet !=null)
        {
            getWorld().removeObject(bullet);
            getWorld().addObject( new  deadSecurity(), getX(), getY());
            getWorld().removeObject(this);
        }
    }
}
