import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Elevator class for transitioning between levels.
 */
public class Elevator extends Actor
{
    private boolean transitioning = false;
    private int successMessageCount = 0;
    private static final int MAX_SUCCESS_MESSAGES = 10;

    /**
     * Constructor for scaling and rotating the image.
     */
    public Elevator()
    {
        GreenfootImage image = getImage();
        image.rotate(180);
        image.scale(image.getWidth() / 2, image.getHeight() / 2);
        setImage(image);
    }

    /**
     * Act method for elevator behavior.
     */
    public void act()
    {
        if (!areEnemiesRemaining()) {
            if (successMessageCount < MAX_SUCCESS_MESSAGES) {
                displaySuccessMessage();
                successMessageCount++;
            }

            Playerss player = (Playerss) getOneIntersectingObject(Playerss.class);
            if (player != null) {
                levelTransition(getNextWorld(player));
            }
        }
    }

    /**
     * Determines the next world based on the player type.
     */
    public World getNextWorld(Playerss player)
    {
        if (player instanceof Player2) {
            return new LTwoWorld();  // Transition to Level 2
        } else if (player instanceof Player3) {
            return new LThreeWorld();  // Transition to Level 3
        } else if (player instanceof Player4) {
            return new BossWorld();  // Transition to Boss level
        }
        return null;  // No valid transition
    }

    /**
     * Handles level transition with music stopping and new world initialization.
     */
    public void levelTransition(World nextWorld)
    {
        if (!transitioning && nextWorld != null) {
            transitioning = true; //prevent multiple triggers

            // Stop current world's music
            World currentWorld = getWorld();

            // Create a transition effect and add it to the world
            TransitionEffect transition = new TransitionEffect(currentWorld.getWidth(), currentWorld.getHeight(), nextWorld);
            currentWorld.addObject(transition, currentWorld.getWidth() / 2, currentWorld.getHeight() / 2);
        }
    }

    /**
     * Displays the "Level Cleared" message.
     */
    public void displaySuccessMessage()
    {
        World world = getWorld();
        Message message = new Message(
            "Level Cleared",  // Message text
            100,              // Font size
            150,              // Text color
            120,              // Lifetime in frames
            30
        );
        world.addObject(message, world.getWidth() / 2, world.getHeight() / 2);
    }

    /**
     * Checks if any enemies are remaining in the level.
     */
    public boolean areEnemiesRemaining()
    {
        World currentWorld = getWorld();
        List<Enemiess> enemies = currentWorld.getObjects(Enemiess.class);
        return !enemies.isEmpty();
    }
}
