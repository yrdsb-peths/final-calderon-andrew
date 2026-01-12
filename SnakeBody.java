import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeBody extends Actor
{
    /**
     * Act - do whatever the SnakeBody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public SnakeBody() {
        GreenfootImage img = new GreenfootImage(20, 20);
        img.setColor(new Color(34, 197, 94));
        img.fillRect(0, 0, 20, 20);
        setImage(img);
    
    }   
}
    

