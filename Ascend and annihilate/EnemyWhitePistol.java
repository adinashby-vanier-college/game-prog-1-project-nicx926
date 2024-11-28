import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyWhitePistol extends Enemiess
{

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        lookForPlayers();
        manageCooldown();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
        
    }
    /**public void die()
    {   Actor bullet = getOneIntersectingObject(Bullet.class);
          if(bullet !=null){
            Bullet bullet = (Bullet) bulletActo
        {
            getWorld().removeObject(bullet);
            getWorld().removeObject(this);
        }
    **/
}

