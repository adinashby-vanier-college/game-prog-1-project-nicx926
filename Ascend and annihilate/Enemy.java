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
        moveAround();
        lookForPlayer();
        manageCooldown();
        if (isGameOver()) {
            transitionToGameOverWorld();
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
    public void lookForPlayer()
    {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        if (player != null && withinRange(player, 200)) {
            turnTowards(player.getX(), player.getY());
            shootBullet();
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
