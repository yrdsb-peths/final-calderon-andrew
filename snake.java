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
    private String direction = "right";
    private int moveCounter = 0;
    
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
        
        //Movement
        
        if (Greenfoot.isKeyDown("up")) {
            direction = "up";
        
        }
        
        if(Greenfoot.isKeyDown("down")){
            direction = "down";
        }
        
        if(Greenfoot.isKeyDown("left")){
            direction = "left";
        }
            
        if(Greenfoot.isKeyDown("right")){
            direction = "right";
        }
        
        moveCounter++;
        if (moveCounter >= 8) {
            moveSnake();
            moveCounter = 0;
        }
    }

    public void moveSnake()
    {
        if (direction.equals("up")) setLocation(getX(), getY() - 20);
        if (direction.equals("down")) setLocation(getX(), getY() + 20);
        if (direction.equals("left")) setLocation(getX() - 20, getY());
        if (direction.equals("right")) setLocation(getX() + 20, getY());
            
        
    }
        
    private void createBody() {
        
    }
    
    
}




