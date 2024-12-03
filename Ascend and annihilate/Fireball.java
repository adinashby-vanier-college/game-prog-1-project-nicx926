import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 *
 */
public class Fireball extends Actor
{

    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);  // Move the fireball forward
        checkCollision();
        /**if (isAtEdge()) {
            getWorld().removeObject(this);  // Remove fireball if it hits the edge
        }**/
    }
    
    private void checkCollision()
    {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        } else if (isTouching(Playerss.class)) {
            Playerss player = (Playerss) getOneIntersectingObject(Playerss.class);
            player.takeDamage(); // Implement `takeDamage` in `Playerss`
            getWorld().removeObject(this);
        }
    }
}   