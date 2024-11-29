// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class BossWorld extends World
{

    /**
     * Constructor for objects of class BossWorld.
     */
    public BossWorld()
    {
        super(1036, 848, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        satan satan =  new satan();
        addObject(satan, 495, 404);
        Player4 player4 =  new Player4();
        addObject(player4, 227, 491);
        EnemyBluPistol enemyBluPistol =  new EnemyBluPistol();
        addObject(enemyBluPistol, 479, 233);
    }
}
