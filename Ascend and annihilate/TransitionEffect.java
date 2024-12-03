import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * This actor is in charge of the fading in and fading out between levels.
 */
public class TransitionEffect extends Actor
{
    private int transparency = 0; // Starting transparency (fully transparent)
    private int fadeSpeed = 5; 
    private boolean fadingOut = true; // Start with fading out
    private World nextWorld; // The world to transition to

    /**
     * Constructor for TransitionEffect.
     */
    public TransitionEffect(int width, int height, World nextWorld)
    {
        this.nextWorld = nextWorld;

        // Create a black rectangle covering the screen
        GreenfootImage image = new GreenfootImage(width, height);
        image.setColor(Color.BLACK);
        image.fill();
        setImage(image);
        getImage().setTransparency(transparency);
    }

    /**
     * Act - Handles the fading effect and world transitions.
     */
    public void act()
    {
        if (fadingOut) {
            transparency += fadeSpeed; // Increase the transparency
            if (transparency >= 255) { // Fully opaque
                transparency = 255;
                fadingOut = false; // Switch to fade in

                // Stop current world's music
                World currentWorld = getWorld();
                if (currentWorld instanceof LOneWorld) {
                    ((LOneWorld) currentWorld).stopped();
                } else if (currentWorld instanceof LTwoWorld) {
                    ((LTwoWorld) currentWorld).stopped();
                } else if (currentWorld instanceof LThreeWorld) {
                    ((LThreeWorld) currentWorld).stopped();
                } else if (currentWorld instanceof BossWorld) {
                    ((BossWorld) currentWorld).stopped();
                }

                // Check if the next world is NOT GameOverWorld
                if (!(nextWorld instanceof GameOverWorld)) {
                    // Transition to the next world
                    Greenfoot.setWorld(nextWorld);

                    // Start next world's music
                    if (nextWorld instanceof LTwoWorld) {
                        ((LTwoWorld) nextWorld).started();
                    } else if (nextWorld instanceof LThreeWorld) {
                        ((LThreeWorld) nextWorld).started();
                    } else if (nextWorld instanceof BossWorld) {
                        ((BossWorld) nextWorld).started();
                    }
                }
            }
        } else {
            transparency -= fadeSpeed; // Decrease the transparency
            if (transparency <= 0) { // Fully transparent
                transparency = 0;
                getWorld().removeObject(this); // Remove transition effect actor
            }
        }
        getImage().setTransparency(transparency); // Apply the transparency
    }
}
