import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Player2 extends Playerss
{
    public int survivorRotation;
    private int ammoCount;
    private int maxAmmo;
    private int reloadCooldown;
    private int reloadTimer;
    private boolean isShooting; // To track mouse button state

    public Player2()
    {
        maxAmmo = 6;
        ammoCount = maxAmmo;
        reloadCooldown = 100;
        reloadTimer = 0;
        isShooting = false; // Initially not shooting
    }

    public void act()
    {
        look();
        move();
        shoot();
        reload();
        displayAmmo();
        displayHealth();
        survivorRotation = getRotation();
    }
    public void shoot()
    {
        if (ammoCount > 0 && reloadTimer == 0) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse != null) {
                if (mouse.getButton() == 1 && !isShooting) {
                    Bullet bullet = new Bullet(survivorRotation);
                    getWorld().addObject(bullet, getX(), getY());
                    ammoCount--;
                    Greenfoot.playSound("pistol.mp3");
                    isShooting = true; // Prevent shooting again until button is released
                }
            } else {
                // Reset shooting flag when the button is released
                isShooting = false;
            }
    
            // Allow shooting again once the mouse button is released
            if (mouse == null || mouse.getButton() != 1) {
                isShooting = false;
                }
            }
    }
    public void reload()
    {
        if (ammoCount == 0 && reloadTimer == 0) {
            reloadTimer = reloadCooldown;
            Greenfoot.playSound("reload.mp3");
        }

        if (reloadTimer > 0) {
            reloadTimer--;
            if (reloadTimer == 0) {
                ammoCount = maxAmmo;
            }
        }
    }

    public void displayAmmo()
    {
        getWorld().showText("Ammo: " + ammoCount + "/" + maxAmmo, 100, 50);
        if (reloadTimer > 0) {
            getWorld().showText("Reloading...", 100, 70);
        }
    }
}
