import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * rozmražování trpasliku * 
 * @Šustková Veronika
 * @22. 5. 2024
 */
public class Trpaslik extends Actor
{ 
    
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
