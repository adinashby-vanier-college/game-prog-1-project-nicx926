import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    private String text;
    private int finalFontSize;
    private int lifeTime; // how long the message should stay visible
    private int scalingDuration; // duration for scaling
    private int age; // tracks how long the message has been alive
    private int initialFontSize; // starting font size
   
    public Message(String text, int initialFontSize, int finalFontSize, int lifeTime, int scalingDuration) {
        this.text = text;
        this.initialFontSize = initialFontSize;
        this.finalFontSize = finalFontSize;
        this.lifeTime = lifeTime;
        this.scalingDuration = scalingDuration;
        this.age = 0;
       
        // Set initial image with starting font size
        updateImage(initialFontSize);
    }
   
    /**
     * Act method that is called every frame to update the message
     */
    public void act()
    {
        age++;
       
        // Handle scaling animation if the message is within the scaling duration
        if (age <= scalingDuration) {
            // Calculate the current font size based on age and scaling duration
            int fontSize = initialFontSize + (int) ((finalFontSize - initialFontSize) * ((double) age / scalingDuration));
            updateImage(fontSize);
        }
       
        // After the message's lifetime expires, remove it from the world
        if (age >= lifeTime) {
            getWorld().removeObject(this); // Removes this message from the world
        }
    }
   
    /**
     * Update the text image with the given font size
     */
    private void updateImage(int fontSize) {
        GreenfootImage image = new GreenfootImage(text, fontSize, Color.GREEN, null); // Create a new image
        setImage(image); // Set the image to the actor
    }
}