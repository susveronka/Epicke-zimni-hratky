import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;


public class Kulicka extends Actor
{
        private int body = 0;
        
    /**
     * Act - do whatever the Kulicka wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    { 
        
                List <Trpaslik> seznamTrpasliku= getIntersectingObjects(Trpaslik.class);
            
                body += seznamTrpasliku.size();
            
            for(Trpaslik trpaslik: seznamTrpasliku)
            
            {
                getWorld().removeObjects(seznamTrpasliku);
                int X = getX();
                int Y = getY();
                
                TrpaslikDruhy trpaslicek = new TrpaslikDruhy();
                getWorld().addObject(trpaslicek, X, Y);
            
            }
            
            
             
               
            
                move(10);
      

}

}
