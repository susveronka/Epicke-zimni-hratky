import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomba extends Actor
{
    private int rychlost = 3;
    
    /**
     * Act - do whatever the Bomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
            move(5);
            
                if(isAtEdge())
            {
                turn(180);
                setLocation(getX(), getY()-130);
                int Y = getY();
                
                if ( Y < 420)
                {
                 setLocation(getX(), getY()+180);
                }
            
            }
        
            if(isTouching(Kulicka.class))
        {
            Greenfoot.stop();
            getWorld().showText("GAME OVER", 600, 400);
        }
        // Add your action code here.
    }
}
