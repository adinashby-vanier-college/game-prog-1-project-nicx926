import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Elevator2To3 extends Elevator
{

    /**
     * Act - do whatever the Elevator2To3 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Player3 player = (Player3) getOneIntersectingObject(Player3.class);
        if(player!=null){
            levelTransition(new LThreeWorld());
        }
    }
}
