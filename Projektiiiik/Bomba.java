import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * rozmražování trpasliku * 
 * @Šustková Veronika
 * @22. 5. 2024
 */
public class Bomba extends Actor
{
    private int rychlost = 3;
    
   
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
