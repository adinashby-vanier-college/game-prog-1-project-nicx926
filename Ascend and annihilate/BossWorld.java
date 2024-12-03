import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BossWorld extends World
{
    private GreenfootSound gameMusic;
    /**
     * Constructor for objects of class BossWorld.
     */
    public BossWorld()
    {
        super(1036, 848, 1);
        gameMusic =  new  GreenfootSound("Boss.mp3");
        prepare();
    }

    public void started()
    {
        gameMusic.playLoop();
    }

    public void stopped()
    {
        gameMusic.stop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player4 player4 =  new  Player4();
        addObject(player4, 227, 491);
        EnemyBluPistol enemyBluPistol =  new  EnemyBluPistol();
        addObject(enemyBluPistol, 479, 233);
        removeObject(enemyBluPistol);
        Satan satan = new Satan();
        addObject(satan, 300, 200);
    }
}
