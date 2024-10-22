// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LOneWorld extends World
{

    /**
     * Constructor for objects of class LOneWorld.
     */
    public LOneWorld()
    {
        super(830, 800, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player =  new  Player();
        addObject(player, 226, 207);
        Enemy enemy =  new  Enemy();
        addObject(enemy, 296, 299);
        enemy.setLocation(302, 430);
        enemy.setLocation(208, 384);
        enemy.setLocation(120, 547);
        enemy.setLocation(157, 536);
        enemy.setLocation(131, 689);
        enemy.setLocation(146, 371);
        enemy.setLocation(149, 402);
        deadSecurity deadSecurity =  new  deadSecurity();
        addObject(deadSecurity, 529, 556);
        deadSecurity.setLocation(539, 542);
        deadSecurity.setLocation(159, 426);
        deadSecurity.setLocation(160, 432);
        deadSecurity.setLocation(176, 437);
        removeObject(deadSecurity);
        addObject(deadSecurity, 190, 433);
        deadSecurity.setLocation(139, 375);
        deadSecurity.setLocation(149, 365);
        deadSecurity.setLocation(154, 386);
        deadSecurity.setLocation(189, 383);
        removeObject(deadSecurity);
        enemy.setLocation(165, 459);
        worker worker =  new  worker();
        addObject(worker, 440, 340);
        worker worker2 =  new  worker();
        addObject(worker2, 655, 587);
        worker worker3 =  new  worker();
        addObject(worker3, 267, 644);
        Enemy enemy2 =  new  Enemy();
        addObject(enemy2, 349, 390);
        enemy.setLocation(152, 385);
        enemy2.setLocation(353, 377);
        worker.setLocation(418, 291);
        worker2.setLocation(618, 564);
        worker3.setLocation(376, 603);
    }
}
