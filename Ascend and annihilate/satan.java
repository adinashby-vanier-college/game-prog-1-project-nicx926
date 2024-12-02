import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Satan extends Actor
{
    private int fireballTimer = 0;  // Timer to control when to shoot fireballs
    private int rayTimer = 0;  // Timer to control when to shoot rays
    private int health = 100;  // Satan's health (200 hits)
    private int hitCount = 0;  // Count how many times Satan has been hit by bullets
    private GreenfootImage healthImage;  // Image to display health
    
    public Satan() {
        healthImage = new GreenfootImage(200, 30);  // Create an image for health display
        updateHealthDisplay();  // Initialize health bar
    }

    /**
     * Act - do whatever the satan wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        shootFireballs();  // Fireballs shooting in a pattern
        shootRayTowardsPlayer();  // Fire a ray towards Player 4
        checkForBulletCollision();  // Check if Satan is hit by bullets

        // If health drops to zero, change the world
        if (health <= 0) {
            World world = getWorld();
            if (world != null) {
                Greenfoot.setWorld(new WinWorld());  // Switch to WinWorld when Satan dies
            }
        }
        
        // Update health display
        updateHealthDisplay();
    }

    /**
     * Move around the screen with random turns
     */
    public void moveAround()
    {
        move(3);

        // Randomly turn with a 1 in 10 chance
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }

        // If at the edge of the world, turn around
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * Shoot fireballs in a predetermined pattern
     */
    public void shootFireballs()
    {
        fireballTimer++;  // Increment the timer each frame

        // Shoot a fireball at a fixed interval (every 100 frames for example)
        if (fireballTimer % 220 == 0) {
            Fireball fireball = new Fireball();  // Create a new fireball object
            getWorld().addObject(fireball, getX(), getY());  // Add it to the world at Satan's current location
            fireball.setRotation(getRotation());
            Greenfoot.playSound("fire.mp3");  // Play fireball sound
        }
    }

    /**
     * Shoot a ray towards the player at a reduced frequency
     */
    public void shootRayTowardsPlayer()
    {
        rayTimer++;  // Increment the ray timer each frame

        // Shoot a ray every 120 frames (for example)
        if (rayTimer % 120 == 0) {
            // Find the player (Player 4) object
            Player4 player = (Player4) getWorld().getObjects(Player4.class).get(0);
            Greenfoot.playSound("woosh.mp3");
            if (player != null) {
                // Calculate the angle between Satan and player
                int deltaX = player.getX() - getX();
                int deltaY = player.getY() - getY();
                double angle = Math.toDegrees(Math.atan2(deltaY, deltaX));  // Angle between Satan and player

                // Add uncertainty (random offset) to the angle, within a range of ±15 degrees
                int uncertainty = Greenfoot.getRandomNumber(20) - 15;  // Random value between -15 and 15
                angle += uncertainty;

                // Shoot the ray towards the player with the new angle
                Ray ray = new Ray();
                getWorld().addObject(ray, getX(), getY());  // Add ray at the boss's position
                ray.setRotation((int) angle);  // Set the direction of the ray with uncertainty
            }

            // Reset the ray timer to control the frequency
            rayTimer = 0;
        }
    }

    /**
     * Check if Satan is hit by a Bullet and reduce health accordingly
     */
    private void checkForBulletCollision()
    {
        Bullet bullet = (Bullet) getOneIntersectingObject(Bullet.class);

        if (bullet != null) {
            health--;  // Decrease health on bullet hit
            hitCount++;  // Increase the hit count
            getWorld().removeObject(bullet);  // Remove the bullet after it hits Satan

            // Update health display
            updateHealthDisplay();
        }
    }

    /**
     * Update the health bar display on the screen
     */
    private void updateHealthDisplay()
    {
        // Create a new image for the health bar (if not already created)
        healthImage.clear();  // Clear previous health image
        healthImage.setColor(Color.RED);  // Set the color to red
        healthImage.fillRect(0, 0, health, 30);  // Fill the health bar with the current health value
        
        // Draw the health bar on the world background in the top-right corner
        //getWorld().showText("Health: " + health, getWorld().getWidth() - 80, 250);
    }

    /**
     * Return the number of hits Satan has taken
     */
    public int getHitCount() {
        return hitCount;
    }
}