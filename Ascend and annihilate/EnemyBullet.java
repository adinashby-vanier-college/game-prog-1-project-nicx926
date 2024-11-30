import greenfoot.*;

/**
 * Represents a bullet fired by the enemy.
 */
public class EnemyBullet extends Actor {
    private int rotationAngle; // Store the rotation value passed from the enemy

    public EnemyBullet(int rotationAngle) {
        this.rotationAngle = rotationAngle; // Store the rotation angle
        setRotation(rotationAngle); // Set the initial rotation of the bullet
    }

    /**
     * Act - do whatever the EnemyBullet wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        move(5); // Move the bullet forward at a constant speed
        // Check for collisions with the player
        Playerss player = (Playerss) getOneIntersectingObject(Playerss.class);
        if (player != null) {
            player.checkIfHit(); // Call the player's method to reduce health
            getWorld().removeObject(this); // Remove the bullet after hitting the player
        }

        // Remove the bullet if it goes off screen
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
