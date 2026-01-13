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
    
    
    public snake() {
        GreenfootImage img = new GreenfootImage(20, 20);
        img.setColor(Color.GREEN);
        img.fillOval(0, 0, 20, 20);
        setImage(img);
    }
  

    public void act()
    {
         
        if (isTouching(Apple.class)) {
            removeTouching(Apple.class);
            ((MyWorld)getWorld()).spawnApple();
        }
    
    }
       

    public void moveSnake()
        {
        
        }
        
    private void createBody() {
        
        }
    
    
}




