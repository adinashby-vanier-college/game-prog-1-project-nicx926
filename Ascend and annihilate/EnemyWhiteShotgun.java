// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class EnemyWhiteShotgun extends Enemiess
{

    /**
     * Act - do whatever the EnemyWhiteShotgun wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        moveAround();
        manageCooldown();
        lookForPlayers();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }
}
