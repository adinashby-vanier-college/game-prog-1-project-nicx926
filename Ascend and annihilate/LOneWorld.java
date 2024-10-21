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
        Player player =  new Player();
        addObject(player, 226, 207);
        Pistol pistol =  new Pistol();
        addObject(pistol, 263, 203);
        pistol.setLocation(245, 204);
        Pistol pistol2 =  new Pistol();
        addObject(pistol2, 115, 357);
        Pistol pistol3 =  new Pistol();
        addObject(pistol3, 460, 550);
    }
}
