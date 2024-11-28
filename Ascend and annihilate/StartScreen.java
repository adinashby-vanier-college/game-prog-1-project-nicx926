import lang.stride.*;
import java.util.*;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartScreen extends World {
    private boolean showText = true; // Tracks whether the text is visible
    private int flashTimer = 30; // Timer for flashing effect (adjust for speed)
   
    public StartScreen() {
        super(640, 640, 1); // Set the screen size
        //setBackground(new GreenfootImage("background-image.png")); // Optional: Set background image
    }

    @Override
    public void act() {
        handleTextFlashing(); // Flash the "Press Spacebar" text
        checkForStart(); // Check if the spacebar is pressed
    }

    private void handleTextFlashing() {
        if (flashTimer > 0) {
            flashTimer--;
        } else {
            showText = !showText; // Toggle text visibility
            flashTimer = 30; // Reset the timer
        }

        if (showText) {
            showText("Press Spacebar to Start", getWidth() / 2, getHeight() - 30); // Display the text
        } else {
            showText("", getWidth() / 2, getHeight() - 30); // Clear the text
        }
    }

    private void checkForStart() {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new LOneWorld()); // Switch to LOneWorld
        }
    }
}