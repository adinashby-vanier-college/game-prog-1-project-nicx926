// WARNING: This file is auto-generated and any changes to it will be overwritten
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
    }
}
