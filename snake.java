import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snake extends Actor
{
    /**
     * Act - do whatever the snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    // test 
    private ArrayList<SnakeBody> body = new ArrayList<>();
    private int dx = 5;
    private int dy = 0;
    private boolean bodyCreated = false;
    
    public snake() {
        GreenfootImage img = new GreenfootImage(20, 20);
        img.setColor(Color.GREEN);
        img.fillOval(0, 0, 20, 20);
        setImage(img);
    }
  

    public void act()
    {
         if (!bodyCreated) {
            createBody();
            bodyCreated = true;
        }
       moveSnake();
        if (isTouching(Apple.class)) {
            removeTouching(Apple.class);
            ((MyWorld)getWorld()).spawnApple();
    }
    
    }
       

        public void moveSnake()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(2);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(2);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(2);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(2);
        }
    }
        private void createBody() {
        for (int i = 1; i <= 3; i++) {
            SnakeBody segment = new SnakeBody();
            body.add(segment);
            getWorld().addObject(segment, getX() - (i * 20), getY());
        }
    }
    
}




