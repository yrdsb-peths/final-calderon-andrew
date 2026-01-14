import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends World
{

    /**
     * Constructor for objects of class GameOverScreen.
     * 
     */
    public GameOverScreen(int finalScore)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("GAME OVER", 300, 150);
        showText("Final Score: " + finalScore, 300, 200);
        showText("Press SPACE to Restart", 300, 250);
    }
    
    public void act()
    {
        checkRestart();
    }
    
    private void checkRestart(){
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new TitleScreen());
        }
    }
}
