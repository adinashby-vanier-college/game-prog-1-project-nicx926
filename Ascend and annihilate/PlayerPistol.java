// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PlayerPistol extends Players
{

    /**
     * Act - do whatever the PlayerPistol wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        look();
        move();
    }

    /**
     * 
     */
    public void look()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            turnTowards(mouse.getX(), mouse.getY());
        }
    }

    /**
     * 
     */
    public void move()
    {
        int dx = 0;
        int dy = 0;
        if (Greenfoot.isKeyDown("a")) {
            dx = -2;
        }
        if (Greenfoot.isKeyDown("d")) {
            dx = 2;
        }
        if (Greenfoot.isKeyDown("w")) {
            dy = -2;
        }
        if (Greenfoot.isKeyDown("s")) {
            dy = 2;
        }
        int newX = getX() + dx;
        int newY = getY() + dy;
        setLocation(newX, newY);
        if (isTouching(Wall.class)) {
            setLocation(getX() - dx, getY() - dy);
        }
    }
}
