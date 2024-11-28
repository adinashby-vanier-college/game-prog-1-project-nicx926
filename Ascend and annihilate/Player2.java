import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 *
 */
public class Player2 extends Playerss
{
    private int ammoCount = 6;  // 6 shots available initially
    private boolean reloading = false;  // Flag to check if it's reloading
    private long reloadStartTime;  // Stores the time when reloading starts
    public int survivorRotation;
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        look();
        move();
         if (Greenfoot.mouseClicked(null) && !reloading)
        {
            if (ammoCount > 0)
            {
                fireShot();
                Greenfoot.playSound("pistol.mp3");// Fire a shot if ammo is available
            }
            else
            {
                reload();
                Greenfoot.playSound("reload.mp3");// Reload if no ammo left
            }
        }
       
        if (reloading && (System.currentTimeMillis() - reloadStartTime >= 3000))
        {
            completeReload();  // Complete reload after 3 seconds
        }
       
        // You could add additional player movement or actions here if needed.
    }
    private void fireShot()
    {
        ammoCount--;
        getWorld().addObject(new Bullet(survivorRotation), getX(), getY());  // Adds a bullet to the world at the player2's position      
    }

    // Starts the reloading process
    private void reload()
    {
        reloading = true;
        reloadStartTime = System.currentTimeMillis();  // Record the start time of reloading
        
    }

    // Completes the reload and refills the ammo
    private void completeReload()
    {
        ammoCount = 6;  // Refills the revolver with 6 shots
        reloading = false;
        
    }
}
