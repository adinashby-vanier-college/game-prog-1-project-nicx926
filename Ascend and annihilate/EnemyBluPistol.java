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
    }
    public EnemyBluPistol()
    {
        maxShots = 3;
    }
}
