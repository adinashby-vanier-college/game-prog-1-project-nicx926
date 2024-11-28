import lang.stride.*;
import java.util.*;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Vanier extends World {
    private int fadeTimer = 240; // Total duration (4 seconds at 60 FPS)
    private GreenfootImage fadeImage;

    public Vanier() {
        super(1000, 672, 1); // Set the screen size as needed
        fadeImage = new GreenfootImage(getWidth(), getHeight());
    }

    @Override
    public void act() {
        fadeTimer--;
        if (fadeTimer >= 2) {
            applyFadeEffect();
        } else {
            Greenfoot.setWorld(new StartScreen());
        }
    }

    private void applyFadeEffect() {
        int alpha = (int) ((240 - fadeTimer) / 240.0 * 255); // Calculate fade-out alpha
        alpha = Math.min(alpha, 255); // Ensure alpha doesn't exceed 255
        fadeImage.setColor(new Color(0, 0, 0, alpha)); // Black with transparency
        fadeImage.fill();
        getBackground().drawImage(fadeImage, 0, 0);
    }
}