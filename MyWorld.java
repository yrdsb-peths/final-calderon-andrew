import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        snake snake = new snake();
        addObject(snake, 300, 200);
    }
}
