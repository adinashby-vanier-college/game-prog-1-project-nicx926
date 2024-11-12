// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemy extends Actor
{

    /**
     * 
     */
    public Enemy()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        moveAround();
        lookForPlayers();
        manageCooldown();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * 
     */
    private void move()
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

    /**
     * 
     */
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

    /**
     * 
     */
    public void lookForPlayers()
    {
        Players closestPlayer = (Players)getOneObjectAtOffset(0, 0, Players.class);
        if (closestPlayer != null && within) {
        }
        
    }

    /**
     * 
     */
    public boolean withinRange(Player player, int range)
    {
        int distance = (int)Math.hypot(getX() - player.getX(), getY() - player.getY());
        return distance <= range;
    }

    /**
     * 
     */
    public void shootBullet()
    {
        int shootCooldown = 0;
        int reloadTime = 100;
        int burstShotsLeft = 3;
        if (shootCooldown == 0) {
            Bullet bullet =  new  Bullet();
            getWorld().addObject(bullet, getX(), getY());
            bullet.setRotation(getRotation());
            shootCooldown = 50;
            burstShotsLeft = burstShotsLeft - 1;
        }
        else {
            if (burstShotsLeft == 0) {
                reloadTime = 100;
                burstShotsLeft = 3;
            }
        }
    }

    /**
     * 
     */
    public void manageCooldown()
    {
        int shootCooldown = 0;
        int reloadTime = 100;
        int burstShotsLeft = 3;
        if (shootCooldown > 0) {
            shootCooldown = shootCooldown - 1;
        }
        if (reloadTime > 0) {
            reloadTime = reloadTime - 1;
        }
        else {
            if (reloadTime == 0 && burstShotsLeft == 0) {
                burstShotsLeft = 3;
            }
        }
    }

    /**
     * 
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Player.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameOverWorld()
    {
        World GameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(GameOverWorld);
    }
}
