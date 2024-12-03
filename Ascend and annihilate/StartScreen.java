import lang.stride.*;
import java.util.*;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartScreen extends World {
    private boolean showText = true; // Tracks whether the text is visible
    private int flashTimer = 30; // Timer for flashing effect (adjust for speed)
    private GreenfootSound gameMusic;
   
    public StartScreen() {
        super(640, 640, 1); // Set the screen size
        gameMusic =  new  GreenfootSound("StartMusic.mp3");
        //setBackground(new GreenfootImage("background-image.png")); // Optional: Set background image
    }
    
    public void started()
    {
        gameMusic.playLoop();
    }

    public void stopped()
    {
        gameMusic.stop();
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
            stopped();
            World levelOne = new LOneWorld();
            levelOne.started();
            Greenfoot.setWorld(levelOne); // Switch to LOneWorld
        }
    }
}