import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinWorld extends World
{
    private GreenfootSound gameMusic;
    /**
     * Constructor for objects of class WinWorld.
     */
    public WinWorld()
    {
        super(1010, 670, 1);
        gameMusic =  new  GreenfootSound("happyend.mp3");
        prepare();
    }
    
    public void started()
    {
        gameMusic.play();
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
        wintext wintext =  new  wintext();
        addObject(wintext, 510, 342);
        removeObject(wintext);
        addObject(wintext, 510, 339);
    }
}
