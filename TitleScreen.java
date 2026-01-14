import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    private Label titleLabel;
    private Label instructionLabel;
    
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    
    
        titleLabel = new Label("VIDEO GAME OF SERPENTS", 48);
        addObject(titleLabel, 300, 150);
        
        instructionLabel = new Label ("Press SPACE to Start", 24);
        addObject(instructionLabel, 300, 250);
         
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        
        if(Greenfoot.isKeyDown("6") || Greenfoot.isKeyDown("7"))
        {
            System.out.println("67");
        }
    }
}
