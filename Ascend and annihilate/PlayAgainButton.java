import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PlayAgainButton extends Actor
{
    private World levelRestart;
    // Constructor accepts the current level world
    public PlayAgainButton(World currentLevel) {
        this.levelRestart = currentLevel;
        setImage(new GreenfootImage("Play Again", 24, Color.WHITE, Color.BLACK));
    }
    /**
     * Act - do whatever the StartAgainButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       button();
    }
    
    public void button(){
        if (Greenfoot.mouseClicked(this)) {
            if(levelRestart instanceof LOneWorld) {
                Greenfoot.setWorld(new LOneWorld()); // Reset to Level One
            }else if (levelRestart instanceof LTwoWorld) {
                Greenfoot.setWorld(new LTwoWorld()); // Reset to Level Two
            }else if (levelRestart instanceof LThreeWorld) {
                Greenfoot.setWorld(new LThreeWorld()); // Reset to Level three
            }else if (levelRestart instanceof BossWorld) {
                Greenfoot.setWorld(new BossWorld()); // Reset to Level boss
            }
        }
    }
}
