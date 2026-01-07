import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
  

    public void act()
    {
       moveSnake();
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
}



