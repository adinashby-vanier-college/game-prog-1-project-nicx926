import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 *
 */
public class decorations extends Actor
{

    /**
     * Act - do whatever the decorations wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
   
    public void removeBullet()
    {
        // Check if the decoration is touching a Bullet
        Bullet bullet = (Bullet) getOneIntersectingObject(Bullet.class);
        EnemyBullet bulletEnemy = (EnemyBullet) getOneIntersectingObject(EnemyBullet.class);
       
        if (bullet != null || bulletEnemy != null || isAtEdge()) {
            // Remove the Bullet object if there is a collision or the decoration is at the edge
            getWorld().removeObject(bullet); // Correctly remove the specific bullet
            getWorld().removeObject(bulletEnemy);
        }
    }
   
    public void checkPlayerCollision(){
        if (isTouching(Playerss.class)) {
            // If the player is touching the decoration, we stop them from moving.
            // For that, we need to find the player's direction of movement and adjust their position
            Playerss player = (Playerss) getOneIntersectingObject(Playerss.class);
           
            // Check if the player is moving right or left and prevent movement in that direction
            if (player.getX() < getX()) {
                player.setLocation(player.getX() - 1, player.getY()); // Adjust player's X position (moving left)
            } else if (player.getX() > getX()) {
                player.setLocation(player.getX() + 1, player.getY()); // Adjust player's X position (moving right)
            }
           
            // Similarly, check if the player is moving up or down
            if (player.getY() < getY()) {
                player.setLocation(player.getX(), player.getY() - 1); // Adjust player's Y position (moving up)
            } else if (player.getY() > getY()) {
                player.setLocation(player.getX(), player.getY() + 1); // Adjust player's Y position (moving down)
            }
        }
    }
   
    public void checkEnemyCollision(){
        if (isTouching(Enemiess.class)) {
            // If the enemy is touching the decoration, we stop them from moving.
            // Similar to the player, we find the enemy's direction of movement and adjust their position
            Enemiess enemy = (Enemiess) getOneIntersectingObject(Enemiess.class);
           
            // Check if the enemy is moving right or left and prevent movement in that direction
            if (enemy.getX() < getX()) {
                enemy.setLocation(enemy.getX() - 1, enemy.getY()); // Adjust enemy's X position (moving left)
            } else if (enemy.getX() > getX()) {
                enemy.setLocation(enemy.getX() + 1, enemy.getY()); // Adjust enemy's X position (moving right)
            }
           
            // Similarly, check if the enemy is moving up or down
            if (enemy.getY() < getY()) {
                enemy.setLocation(enemy.getX(), enemy.getY() - 1); // Adjust enemy's Y position (moving up)
            } else if (enemy.getY() > getY()) {
                enemy.setLocation(enemy.getX(), enemy.getY() + 1); // Adjust enemy's Y position (moving down)
            }
        }
    }
}
