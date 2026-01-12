import greenfoot.*;

public class MyWorld extends World
{
    private Label scoreLabel;

    public MyWorld()
    {    
        super(600, 400, 1);
        

        snake snake = new snake();
        addObject(snake, getWidth()/2, getHeight()/2);

        
        

        spawnApple();
    }

    public void spawnApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(getWidth() - 40) + 20;
        int y = Greenfoot.getRandomNumber(getHeight() - 40) + 20;
        addObject(apple, x, y);
    }

    public void addScore(int amount)
    {
        
    }
    
     public void gameOver()
    {
        showText("GAME OVER", getWidth()/2, getHeight()/2);
        Greenfoot.stop();
    }
}

