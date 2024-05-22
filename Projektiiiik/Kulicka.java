import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * rozmražování trpasliku * 
 * @Šustková Veronika
 * @22. 5. 2024
 */
public class Kulicka extends Actor
{
        private int body = 0;
        
 
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
