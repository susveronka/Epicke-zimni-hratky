import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class ZachrannyPortal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZachrannyPortal extends Actor

{   
    
    
    public void act()
    
    {   
        
        List <TrpaslikDruhy> seznamTrpaslika = getIntersectingObjects(TrpaslikDruhy.class);
        

        
        for ( TrpaslikDruhy trpaslicek : seznamTrpaslika)
        {
            getWorld().removeObjects(seznamTrpaslika);
           
        
            Trpaslik nahradniTrpaslik = new Trpaslik();
            
            getWorld().addObject(nahradniTrpaslik,Greenfoot.getRandomNumber(1200),480);
        
        }
        
    }
    
}
