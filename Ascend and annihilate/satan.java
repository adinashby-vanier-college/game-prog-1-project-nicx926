import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class satan extends Actor
{
    private int fireballTimer = 0;  // Timer to control when to shoot fireballs
    private int rayTimer = 0;  // Timer to control when to shoot rays

    /**
     * Act - do whatever the satan wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        shootFireballs();  // Fireballs shooting in a pattern
        shootRayTowardsPlayer();  // Fire a ray towards Player 4
    }

    /**
     * Move around the screen with random turns
     */
    public void moveAround()
    {
        move(1);
       
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
        if (fireballTimer % 100 == 0) {
            Fireball fireball = new Fireball();  // Create a new fireball object
            getWorld().addObject(fireball, getX(), getY());  // Add it to the world at the satan's current location
            fireball.setRotation(getRotation());  // Fire in the current direction
        }
    }

    /**
     * Shoot a ray towards the player at a reduced frequency
     */
    public void shootRayTowardsPlayer()
    {
        rayTimer++;  // Increment the ray timer each frame

        // Shoot a ray every 200 frames (for example)
        if (rayTimer % 200 == 0) {
            // Find the player (Player 4) object
            Player4 player = (Player4) getWorld().getObjects(Player4.class).get(0);

            if (player != null) {
                // Calculate the angle between satan and player
                int deltaX = player.getX() - getX();
                int deltaY = player.getY() - getY();
                double angle = Math.toDegrees(Math.atan2(deltaY, deltaX));  // Angle between satan and player

                // Shoot the ray towards the player
                Ray ray = new Ray();
                getWorld().addObject(ray, getX(), getY());  // Add ray at the boss's position
                ray.setRotation((int) angle);  // Set the direction of the ray
            }

            // Reset the ray timer to control the frequency
            rayTimer = 0;
        }
    }
}
