// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LThreeWorld extends World
{

    /**
     * Constructor for objects of class LThreeWorld.
     */
    public LThreeWorld()
    {
        super(1286, 842, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elevator3ToBoss elevator3ToBoss =  new  Elevator3ToBoss();
        addObject(elevator3ToBoss, 797, 541);
        Player4 player4 =  new  Player4();
        addObject(player4, 345, 292);
        elevator3ToBoss.setLocation(1150, 767);
    }
}
