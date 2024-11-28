import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyWhiteRifle extends Enemiess
{

    /**
     * Act - do whatever the EnemyWhiteRifle wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        manageCooldown();
        moveAround();
        move();
        lookForPlayers();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
        die();
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
