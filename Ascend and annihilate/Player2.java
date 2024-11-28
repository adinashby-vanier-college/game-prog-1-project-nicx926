import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player2 extends Playerss
{
    public int survivorRotation;
    private int ammoCount;  // 6 shots available initially
    private int maxAmmo;// Flag to check if it's reloading
    private int reloadCooldown;
    private int reloadTimer;  // Stores the time when reloading starts
    
    public Player2()
    {
        maxAmmo = 6;
        ammoCount = maxAmmo;
        reloadCooldown = 100;
        reloadTimer = 5;
    }
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        look();
        move();
        shoot();
        reload();
        survivorRotation = getRotation();
    }
    public void shoot()
    {
        if(ammoCount > 0 && reloadTimer == 0){
            if(Greenfoot.getMouseInfo() != null && Greenfoot.getMouseInfo().getButton()==1)
            {
                Bullet bullet = new Bullet (survivorRotation);
                getWorld().addObject(bullet,getX(),getY());
                ammoCount--;
                Greenfoot.playSound("pistol.mp3");
            }
        }
    }

    // Starts the reloading process
    public void reload()
    {
        if (ammoCount == 0 && reloadTimer == 0) {
            reloadTimer = reloadCooldown;
            Greenfoot.playSound("reload.mp3");
        }

        // Manage reload timer
        if (reloadTimer > 0) {
            reloadTimer--;
            if (reloadTimer == 0) {
                ammoCount = maxAmmo; // Reset ammo after reload
            }
        }
    }

    // Completes the reload and refills the ammo
    public void displayAmmo()
    {
        getWorld().showText("Ammo: " + ammoCount + "/" + maxAmmo, 100, 50); // Display ammo count
        if (reloadTimer > 0) {
            getWorld().showText("Reloading...", 100, 70); // Show reloading message
        }
    }
}

