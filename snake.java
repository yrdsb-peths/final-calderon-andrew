import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class snake here.
 * 
 * @author  
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
    private int score = 0;  
    private ArrayList<SnakeBody> body = new ArrayList<>();
    private ArrayList <int[]> positions = new ArrayList<>();
    private boolean bodyCreated = false;
    
    public snake() {
        GreenfootImage img = new GreenfootImage(20, 20);
        img.setColor(Color.GREEN);
        img.fillOval(0, 0, 20, 20);
        setImage(img);
    }
  

    public void act()
    {
        if(!bodyCreated){
            createBody();
            bodyCreated = true;
        }
        
        //apple detection
        if (isTouching(Apple.class)) {
            removeTouching(Apple.class);
            ((MyWorld)getWorld()).spawnApple();
            growBody();
            
        }
        
        //Movement
        
        if (Greenfoot.isKeyDown("up") && !direction.equals("down")) {
            direction = "up";
        
        }
        
        if(Greenfoot.isKeyDown("down") && !direction.equals("right")){
            direction = "down";
        }
        
        if(Greenfoot.isKeyDown("left") && !direction.equals("right")){
            direction = "left";
        }
            
        if(Greenfoot.isKeyDown("right") && !direction.equals("left")){
            direction = "right";
        }
        
        moveCounter++;
        if (moveCounter >= 8) {
            moveSnake();
            moveCounter = 0;
            checkWallCollision();
            checkBodyCollision();
            moveCounter = 0;
            
        }
        
    
    }

    public void moveSnake()
    {
        // saves current head position before movement
        positions.add(0, new int [] {getX(), getY()});
        
        //move head
        if (direction.equals("up")) setLocation(getX(), getY() - 20);
        if (direction.equals("down")) setLocation(getX(), getY() + 20);
        if (direction.equals("left")) setLocation(getX() - 20, getY());
        if (direction.equals("right")) setLocation(getX() + 20, getY());
            
        //Move body segments to follow
        for(int i = 0; i<body.size(); i++){
            if(i<positions.size()){
                int[] pos = positions.get(i);
                body.get(i).setLocation(pos[0], pos [1]);
            }
        }
        
        //remove extra positions
        while(positions.size() > body.size()){
            positions.remove(positions.size() - 1);
        }
        
    }
        
    private void createBody() {
        for (int i = 1; i <= 3; i++){ 
            SnakeBody segment = new SnakeBody();
            body.add(segment);
            getWorld().addObject(segment, getX() - (i * 20), getY());
            score++;
        }
    }
    
        private void growBody(){
            for(int i = 0; i< 3 ; i++){
            SnakeBody segment = new SnakeBody();
        
    
    
                // Place at the last body segment's position
                if(body.size() > 1){
                    SnakeBody tail = body.get(body.size() - 1);
                    getWorld().addObject(segment, tail.getX(), tail.getY());
                }
    
                else{
                    getWorld().addObject(segment,getX(), getY());
                }
            body.add(segment);
            }
    }
    
        private void checkWallCollision(){
            if(getX() <= 10 || getX() >= getWorld().getWidth() - 10 
            ||getY() <= 10 || getY() >= getWorld().getHeight() - 10) 
            gameOver();
    }
    
        private void gameOver(){
        {   
            Greenfoot.stop();
        }
    }
    
    private void checkBodyCollision(){
        for(SnakeBody segment : body){
            if(getX() == segment.getX() && getY() == segment.getY()) {
                gameOver();
            }
        }
    }
}





