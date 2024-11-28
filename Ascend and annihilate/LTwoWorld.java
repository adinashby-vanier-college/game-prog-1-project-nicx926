// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LTwoWorld extends World
{

    /**
     * Constructor for objects of class LTwoWorld.
     */
    public LTwoWorld()
    {
        super(1252, 698, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player3 player3 =  new Player3();
        addObject(player3, 159, 626);
        Elevator2To3 elevator2To3 =  new Elevator2To3();
        addObject(elevator2To3, 930, 345);
    }
}
