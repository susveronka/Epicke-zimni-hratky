import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;


public class Delo extends Actor
{
    /**
     * Act - do whatever the Delo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
       
    public void mys()
    {
        
            if(Greenfoot.mouseMoved(null))
        
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int X = mouse.getX();
            int Y = mouse.getY();
            
            turnTowards(X  , Y);
              int actorX = getX();
            int actorY = getY();
            
            // Výpočet úhlu mezi aktuálním objektem a myší
            int angle = (int) Math.toDegrees(Math.atan2(Y - actorY, X - actorX));
            
            // Nastavení rotace objektu
            setRotation(angle);
        
            
        }
    }
    
    public void pridaniKulicky()
    {
        
         String klavesa = Greenfoot.getKey();
             
            if ("space".equals(klavesa)) 
        {
            Kulicka kulicka = new Kulicka();
            int XX = getX();
            
               
            int YY = getY();
            getWorld().addObject(kulicka, XX + 50,YY - 20);
            
            kulicka.setRotation(getRotation());
            
                       if(Greenfoot.mouseMoved(null))
        
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int X = mouse.getX();
            int Y = mouse.getY();
            
            turnTowards(X  , Y);
              int actorX = getX();
            int actorY = getY();
            
            
            int angle = (int) Math.toDegrees(Math.atan2(Y - actorY, X - actorX));
            
            
            setRotation(angle);
    }

}
}
    
    public void act()
    { 
        
        
        
        
        
        
        
        
        mys();
        pridaniKulicky();
        
            String klavesa = Greenfoot.getKey();
             
            if ("space".equals(klavesa)) 
        {
            Kulicka kulicka = new Kulicka();
            int XX = getX();
            
               
            int YY = getY();
            getWorld().addObject(kulicka, XX + 50,YY - 20);
            
            kulicka.setRotation(getRotation());
            
                       if(Greenfoot.mouseMoved(null))
        
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int X = mouse.getX();
            int Y = mouse.getY();
            
            turnTowards(X  , Y);
              int actorX = getX();
            int actorY = getY();
            
            
            int angle = (int) Math.toDegrees(Math.atan2(Y - actorY, X - actorX));
            
            
            setRotation(angle);
            
        
            
        }
          
        
        
        }
        
        
             
        // Add your action code here.
    }
}
