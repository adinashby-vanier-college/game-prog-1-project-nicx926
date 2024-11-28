import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Elevator1To2 extends Elevator
{

    /**
     * Act - do whatever the Elevator1To2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        levelTransition(new LTwoWorld());
    }
}
