import greenfoot.*;

public class EnemyBullet extends Actor
{
    private int speed = 5;

    public void act()
    {
        move(speed);
        checkCollision();
    }

    private void checkCollision()
    {
        if (isTouching(Wall.class) || isAtEdge()) {
            getWorld().removeObject(this);
        } else if (isTouching(Playerss.class)) {
            Playerss player = (Playerss) getOneIntersectingObject(Playerss.class);
            player.takeDamage(); // Implement `takeDamage` in `Playerss`
            getWorld().removeObject(this);
        }
    }
}

