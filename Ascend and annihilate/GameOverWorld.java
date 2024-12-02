import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{
    private World currentLevel;
    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameOverWorld(World currentLevel)
    {
        super(770, 640, 1);
        showTextWithBigBlackFont("GAME OVER!", 250, 250);
        PlayAgainButton playAgain = new PlayAgainButton(currentLevel);
        addObject(playAgain, getWidth() / 2, getHeight() / 2 + 50);
    }

    /**
     * 
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(message, x, y);
    }
}
