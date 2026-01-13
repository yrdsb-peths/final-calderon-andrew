import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;

public class Apple extends Actor
{
    private GreenfootSound crunchSound = new GreenfootSound("crunch.wav");

    public Apple()
    {
        GreenfootImage img = new GreenfootImage(30, 30);
        img.setColor(Color.RED);
        img.fillOval(0, 0, 30, 30);
        setImage(img);
    }

    public void act()
    {
        checkEaten();
    }

    private void checkEaten()
    {
        if (isTouching(Snake.class))
        {
            crunchSound.play();

            int x = Greenfoot.getRandomNumber(getWorld().getWidth());
            int y = Greenfoot.getRandomNumber(getWorld().getHeight());
            setLocation(x, y);
        }
    }
}
