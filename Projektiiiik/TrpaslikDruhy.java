import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class TrpaslikDruhy extends Actor

{
    
    /**
     * Act - do whatever the TrpaslikDruhy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
        public void pohyb()
    {
        
         if(Greenfoot.isKeyDown("left"))
         {
                setLocation(getX()-4,getY());
             
            }
            
            if(Greenfoot.isKeyDown("right"))
         {
                setLocation(getX()+ 4,getY());
             
            }
         
    }
    
  
    
        public void act()
    {
            
            
        pohyb();
        
        // Add your action code here.
    }
    
    
}
