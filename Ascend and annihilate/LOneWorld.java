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
        Player playerBat =  new  Player();
        addObject(playerBat, 226, 207);
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
        Worker worker =  new  Worker();
        addObject(worker, 440, 340);
        Worker worker2 =  new  Worker();
        addObject(worker2, 655, 587);
        Worker worker3 =  new  Worker();
        addObject(worker3, 267, 644);
        Enemy enemy2 =  new  Enemy();
        addObject(enemy2, 349, 390);
        enemy.setLocation(152, 385);
        enemy2.setLocation(353, 377);
        worker.setLocation(418, 291);
        worker2.setLocation(618, 564);
        worker3.setLocation(376, 603);
        Wall wall =  new  Wall();
        addObject(wall, 74, 312);
        Wall wall2 =  new  Wall();
        addObject(wall2, 117, 312);
        Wall wall3 =  new  Wall();
        addObject(wall3, 142, 312);
        Wall wall4 =  new  Wall();
        addObject(wall4, 111, 274);
        Wall wall5 =  new  Wall();
        addObject(wall5, 156, 273);
        wall5.setLocation(158, 276);
        Wall wall6 =  new  Wall();
        addObject(wall6, 189, 273);
        wall6.setLocation(194, 273);
        Wall wall7 =  new  Wall();
        addObject(wall7, 263, 312);
        Wall wall8 =  new  Wall();
        addObject(wall8, 302, 312);
        Wall wall9 =  new  Wall();
        addObject(wall9, 341, 311);
        wall9.setLocation(348, 311);
        wall5.setLocation(145, 275);
        wall6.setLocation(193, 274);
        wall5.setLocation(157, 276);
        wall9.setLocation(346, 314);
        wall9.setLocation(349, 315);
        wall9.setLocation(345, 309);
        wall9.setLocation(350, 308);
        wall9.setLocation(349, 313);
        wall5.setLocation(150, 272);
        wall4.setLocation(108, 268);
        wall5.setLocation(149, 266);
        wall6.setLocation(192, 269);
        wall3.setLocation(146, 315);
        wall2.setLocation(103, 317);
        wall.setLocation(64, 315);
        wall2.setLocation(136, 312);
        wall9.setLocation(340, 311);
        wall7.setLocation(264, 318);
        wall8.setLocation(300, 316);
        wall9.setLocation(352, 319);
        wall5.setLocation(155, 265);
        wall4.setLocation(123, 267);
        removeObject(wall3);
        removeObject(wall2);
        removeObject(wall);
        removeObject(wall7);
        removeObject(wall8);
        removeObject(wall9);
        removeObject(wall6);
        removeObject(wall5);
        removeObject(wall4);
        Wall wall10 =  new  Wall();
        addObject(wall10, 168, 155);
        playerBat.setLocation(220, 201);
        playerBat.setLocation(233, 198);
        playerBat.setLocation(224, 198);
        removeObject(playerBat);
        PlayerBat player =  new  PlayerBat();
        addObject(playerBat, 236, 206);
    }
}
