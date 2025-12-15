import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        snake snake = new snake();
        addObject(snake, 300, 200);
        
                scoreBoard = new ScoreBoard();
        addObject(scoreBoard, 70, 20);
        
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
        scoreBoard.add(amount);
    }
}
