import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Elevator3ToBoss extends Elevator
{

    /**
     * Act - do whatever the Elevator3ToBoss wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        levelTransition(new BossWorld());
    }
}
