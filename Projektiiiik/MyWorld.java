import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * rozmražování trpasliku * 
 * @Šustková Veronika
 * @22. 5. 2024
 */
public class MyWorld extends World
{ 
    
       
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
           Pas pas = new Pas();
           this.addObject(pas, 600, 410);
        
          
            
            
            
            
            Delo delo = new Delo();
            this.addObject(delo, 100, 250);
            
            ZachrannyPortal portal =new ZachrannyPortal();
            ZachrannyPortal portal1 =new ZachrannyPortal();
            this.addObject(portal, 10, 570);
            this.addObject(portal1, 1190, 570);
            
             ZachrannyPortal portal2 =new ZachrannyPortal();
            ZachrannyPortal portal3 =new ZachrannyPortal();
            this.addObject(portal2, 10, 420);
            this.addObject(portal3, 1190, 420);
            
              Trpaslik trpaslik = new Trpaslik();
             this.addObject(trpaslik, Greenfoot.getRandomNumber(1200), 580);
             
               Trpaslik trpaslik1 = new Trpaslik();
             this.addObject(trpaslik1, Greenfoot.getRandomNumber(1200), 580);
             
               Trpaslik trpaslik2 = new Trpaslik();
             this.addObject(trpaslik2, Greenfoot.getRandomNumber(1200), 430);
             
               Trpaslik trpaslik3 = new Trpaslik();
             this.addObject(trpaslik3, Greenfoot.getRandomNumber(1200), 580);
             
               Trpaslik trpaslik4 = new Trpaslik();
             this.addObject(trpaslik4, Greenfoot.getRandomNumber(1200), 430);
            
             Trpaslik trpaslik5 = new Trpaslik();
             this.addObject(trpaslik5, Greenfoot.getRandomNumber(1200), 430);
             
             Bomba bomba = new Bomba();
             this.addObject(bomba, Greenfoot.getRandomNumber(1200), 580);
            
        
            
            showText("Účel hry: Za myší se otáčí obsluha děla a mezerníkem střílí kuličky," , 600, 150);
      showText(" díky kterým se rozmrazí trpaslíci a ty šipkami VPRAVO a VLEVO odnést do portálu" , 600, 170);
      showText("Pokud trefíš kuličkou bombu, je konec hry:(", 600, 190);
    }
    
    
    public void act()
    {
        
    

 
    
}

}
