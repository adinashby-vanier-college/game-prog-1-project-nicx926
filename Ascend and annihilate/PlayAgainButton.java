import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * A button that allows the player to restart the level.
 */
public class PlayAgainButton extends Actor
{
    private World levelRestart;

    /**
     * Constructor accepts the current level world.
     * @param currentLevel The level to restart.
     */
    public PlayAgainButton(World currentLevel) {
        this.levelRestart = currentLevel;
        setImage(new GreenfootImage("Play Again", 24, Color.WHITE, Color.BLACK));
    }

    /**
     * Act - Responds to button clicks to restart the level.
     */
    public void act()
    {
        button();
    }
    
    /**
     * Handles button clicks and restarts the corresponding level.
     */
    public void button() {
        if (Greenfoot.mouseClicked(this)) {
            // Stop any ongoing music
            stopAllMusic();

            // Restart the level and play its music
            if (levelRestart instanceof LOneWorld) {
                LOneWorld levelOne = new LOneWorld();
                levelOne.started(); // Start Level One music
                Greenfoot.setWorld(levelOne); // Reset to Level One
            } else if (levelRestart instanceof LTwoWorld) {
                LTwoWorld levelTwo = new LTwoWorld();
                levelTwo.started(); // Start Level Two music
                Greenfoot.setWorld(levelTwo); // Reset to Level Two
            } else if (levelRestart instanceof LThreeWorld) {
                LThreeWorld levelThree = new LThreeWorld();
                levelThree.started(); // Start Level Three music
                Greenfoot.setWorld(levelThree); // Reset to Level Three
            } else if (levelRestart instanceof BossWorld) {
                BossWorld bossWorld = new BossWorld();
                bossWorld.started(); // Start Boss level music
                Greenfoot.setWorld(bossWorld); // Reset to Boss level
            }
        }
    }

    /**
     * Stops any music that may be playing in the game.
     */
    private void stopAllMusic() {
        if (levelRestart instanceof LOneWorld) {
            ((LOneWorld) levelRestart).stopped();
        } else if (levelRestart instanceof LTwoWorld) {
            ((LTwoWorld) levelRestart).stopped();
        } else if (levelRestart instanceof LThreeWorld) {
            ((LThreeWorld) levelRestart).stopped();
        } else if (levelRestart instanceof BossWorld) {
            ((BossWorld) levelRestart).stopped();
        }
    }
}
