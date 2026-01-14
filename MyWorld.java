import greenfoot.*;

public class MyWorld extends World
{
    

    public MyWorld()
    {    
        super(600, 400, 1);
        

        snake snake = new snake();
        addObject(snake, getWidth()/2, getHeight()/2);

        

        spawnApple();
    }
    
    public void act(){
        
        showText("Score: " + getScore(), 50, 20); //shows score
    }

    public int getScore(){
        snake s = (snake) getObjects(snake.class).get(0);
        return s.getScore();
    }
    public void spawnApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(getWidth() - 40) + 20;
        int y = Greenfoot.getRandomNumber(getHeight() - 40) + 20;
        addObject(apple, x, y);
    }

    
    
     public void gameOver()
    {
        showText("GAME OVER", getWidth()/2, getHeight()/2);
        Greenfoot.stop();
    }
    
    public void showGameOver(int finalScore){
        Greenfoot.setWorld(new GameOverScreen(finalScore));
    }
}

