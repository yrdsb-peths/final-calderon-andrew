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
    private GreenfootSound titleMusic;
    
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground("AppleFarm.jpg");
        
        titleMusic = new GreenfootSound("title screen.mp3");
        titleMusic.playLoop();
        titleLabel = new Label("SERPENT", 48);
        addObject(titleLabel, 300, 150);
        
        instructionLabel = new Label ("Press SPACE to Start", 24);
        addObject(instructionLabel, 300, 250);
         
    }
    
    
    public void act()
    {
        String key = Greenfoot.getKey();
        
        if(key != null && key.equals("space"))
        {
            Greenfoot.setWorld(new MyWorld());
            titleMusic.stop();
        }
        
        if(Greenfoot.isKeyDown("6") || Greenfoot.isKeyDown("7"))
        {
            System.out.println("67");
        }
    }
}
