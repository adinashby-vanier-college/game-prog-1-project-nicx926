import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class satan extends Actor
{

    /**
     * Act - do whatever the satan wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(); 
        moveAround();
        die();
        
    }
    public void move()
    {
        int dx = 0;
        int dy = 0;
        if (isTouching(Wall.class)) {
            dx = -2;
        }
        if (isTouching(Wall.class)) {
            dx = 2;
        }
        if (isTouching(Wall.class)) {
            dy = -2;
        }
        if (isTouching(Wall.class)) {
            dy = 2;
        }
        /* Store current position*/
        int newX = getX() + dx;
        int newY = getY() + dy;
        /* Set the new position temporarily*/
        setLocation(newX, newY);
        /* Check for collision after moving*/
        if (isTouching(Wall.class)) {
            /* If touching a wall, revert back to the original position*/
            setLocation(getX() - dx, getY() - dy);
        }
    }
    public void moveAround()
    {
        move(1);
        if ((Greenfoot.getRandomNumber(10) == 1)) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }
    public void die()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet !=null)
        {
            getWorld().removeObject(bullet);
            getWorld().removeObject(this);
        }
    }
}
