import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Trpaslik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trpaslik extends Actor
{ 
    /**
     * Act - do whatever the Trpaslik wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void pohyb()
    {
        
         move(-5);
           if(isAtEdge())
         {
            turn(180);
            
            
        }
         
    }
    public void act()
    {   
        
        
         
        // Add your action code here.
        
          pohyb();
            
         
         
        
        
        
    }
    
    
}
