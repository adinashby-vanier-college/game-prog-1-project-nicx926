import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 *
 */
public class Player4 extends Playerss
{
    public int survivorRotation;
    private int ammoCount;
    private int maxAmmo;
    private int reloadCooldown;
    private int reloadTimer;
    private int shootCooldown; // Cooldown period for shooting
    private int shootTimer; // Timer to track shooting interval

    public Player4()
    {
        super(8);
        maxAmmo = 30; // Set maximum ammo per magazine
        ammoCount = maxAmmo; // Start with full ammo
        reloadCooldown = 200; // Reload time in frames
        reloadTimer = 0; // Timer starts at 0
        shootCooldown = 12; // 0.2 seconds at 60 fps
        shootTimer = 0; // Start with no cooldown
    }

    /**
     * Act - do whatever the Player4 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        look();
        move();
        shoot();
        reload();
        displayAmmo();
        displayHealth();
        survivorRotation = getRotation();
       
        if (shootTimer > 0) {
            shootTimer--; // Decrease the shoot timer if active
        }
    }

    public void shoot()
    {
        if (ammoCount > 0 && reloadTimer == 0 && shootTimer == 0) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null && mouse.getButton() == 1) {
                Bullet bullet = new Bullet(survivorRotation);
                getWorld().addObject(bullet, getX(), getY());
                ammoCount--;
                Greenfoot.playSound("rifleshoot.mp3");
                shootTimer = shootCooldown; // Set the shooting cooldown
            }
        }
    }

    public void reload()
    {
        // Start reload if out of ammo and timer isn't already running
        if (ammoCount == 0 && reloadTimer == 0) {
            reloadTimer = reloadCooldown;
            Greenfoot.playSound("riflereload.mp3");
        }

        // Manage reload timer
        if (reloadTimer > 0) {
            reloadTimer--;
            if (reloadTimer == 0) {
                ammoCount = maxAmmo; // Reset ammo after reload
            }
        }
    }

    public void displayAmmo()
    {
        getWorld().showText("Ammo: " + ammoCount + "/" + maxAmmo, 100, 50); // Display ammo count
        if (reloadTimer > 0) {
            getWorld().showText("Reloading...", 100, 70); // Show reloading message
        }
    }
}