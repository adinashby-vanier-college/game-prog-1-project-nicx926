import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Base class for all enemies.
 */
public class Enemiess extends Characters
{
    protected int accuracyRange; // Lower value = more accurate shooting
    protected int shootCooldown = 0; // Cooldown between shots
    protected int cooldownTime = 60; // Default cooldown time
    protected int shootingRange = 300; // Default shooting range
    protected boolean canShoot = true;

    public Enemiess()
    {
        GreenfootImage image = getImage();
        double scaleFactor = 0.9; // Scale enemy image
        int newWidth = (int)(image.getWidth() * scaleFactor);
        int newHeight = (int)(image.getHeight() * scaleFactor);
        image.scale(newWidth, newHeight);
        setImage(image);
    }

    public void act()
    {
        move();
        moveAround();
        lookForPlayerAndShoot(); // Add shooting logic
        manageCooldown();
        if (isGameOver()) {
            transitionToGameOverWorld();
        }
    }

    public void move()
    {
        if (isTouching(Wall.class)) {
            move(-1); // Back up slightly
            turn(180); // Turn around
        }
    }

    public void moveAround()
    {
        move(1);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45); // Random small turn
        }
        if (isAtEdge()) {
            turn(180); // Turn around if at edge
        }
    }

    public boolean isGameOver()
    {
        return getWorld().getObjects(Playerss.class).isEmpty();
    }

    public void transitionToGameOverWorld()
    {
        World GameOverWorld = new GameOverWorld();
        Greenfoot.setWorld(GameOverWorld);
    }

    // **Shooting Logic**
    public void lookForPlayerAndShoot()
    {
        // Find player
        List<Playerss> players = getWorld().getObjects(Playerss.class);
        if (!players.isEmpty()) {
            Playerss target = players.get(0);
            if (isWithinRange(target)) {
                turnTowards(target.getX(), target.getY());
                if (canShoot && shootCooldown == 0) {
                    shootAtPlayer(target);
                    shootCooldown = cooldownTime; // Start cooldown
                }
            }
        }
    }

    public boolean isWithinRange(Playerss player)
    {
        int distance = (int) Math.hypot(getX() - player.getX(), getY() - player.getY());
        return distance <= shootingRange;
    }

    public void shootAtPlayer(Playerss target)
    {
        // Create an enemy bullet
        EnemyBullet bullet = new EnemyBullet();
        getWorld().addObject(bullet, getX(), getY());

        // Add inaccuracy to the bullet's direction
        int randomAngle = Greenfoot.getRandomNumber(accuracyRange * 2) - accuracyRange;
        bullet.setRotation(getRotation() + randomAngle);

        //Greenfoot.playSound("gunshot.mp3"); // Play sound
    }

    public void manageCooldown()
    {
        if (shootCooldown > 0) {
            shootCooldown--;
        }

        // Random breaks in shooting
        if (shootCooldown == 0 && Greenfoot.getRandomNumber(100) < 10) {
            canShoot = !canShoot; // Toggle shooting state
        }
    }
}
