// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinWorld extends World
{

    /**
     * Constructor for objects of class WinWorld.
     */
    public WinWorld()
    {
        super(1010, 670, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        wintext wintext =  new wintext();
        addObject(wintext, 510, 342);
        removeObject(wintext);
        addObject(wintext, 510, 339);
    }
}
