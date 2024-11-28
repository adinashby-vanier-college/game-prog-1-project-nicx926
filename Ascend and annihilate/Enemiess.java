import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Enemiess extends Characters
{
    public int shotsFired = 0;
    public int maxShots = 5;
    protected int accuracyRange;
    public int survivorRotation;
    int shootCooldown = 0;
    int reloadTime = 100;
    int burstShotsLeft = 3;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        moveAround();
        lookForPlayers();
        manageCooldown();
        shootAtPlayer();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }
    public void shootAtPlayer()
    {
        Playerss target = (Playerss) getWorld().getObjects(Playerss.class).get(0);
        if (target != null && canShoot()){
            Bullet bullet = new Bullet(survivorRotation);
            getWorld().addObject(bullet,getX(),getY());
            
            int randomAngle = Greenfoot.getRandomNumber(accuracyRange * 2) - accuracyRange;
            bullet.setRotation(getRotation() + randomAngle);
            shotsFired++;
        }
    }
    public boolean canShoot()
    {
        return true;
    }
    /**
     * 
     */
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
        List<Playerss> players = getWorld().getObjects(Playerss.class);
        if (!players.isEmpty()) {
        Playerss target = players.get(0); // Assume single player
        if (withinRange(target, 200)) {
            turnTowards(target.getX(), target.getY());
            shootBullet();
        }
    }
    }

    /**
     * 
     */
    public boolean withinRange(Playerss player, int range)
    {
        int distance = (int)Math.hypot(getX() - player.getX(), getY() - player.getY());
        return distance <= range;
    }

    /**
     * 
     */
    public void shootBullet()
    {
        if (shootCooldown == 0 && burstShotsLeft > 0) {
            Bullet bullet =  new  Bullet(false);
            getWorld().addObject(bullet, getX(), getY());
            bullet.setRotation(getRotation());
            shootCooldown = 50;
            burstShotsLeft = burstShotsLeft - 1;
        }
        if (burstShotsLeft == 0 && reloadTime == 0){
            reloadTime = 100;
            burstShotsLeft = 3;
        }
    }
    /**
     * 
     */
    public void manageCooldown()
    {
        if (shootCooldown > 0) {
            shootCooldown = shootCooldown - 1;
        }
        if (reloadTime > 0) {
            reloadTime = reloadTime - 1;
        }
        else if (burstShotsLeft == 0){
            reloadTime = 100;
            burstShotsLeft = 3;
        }
    }
    /**
     * 
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Playerss.class).isEmpty()) {
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
