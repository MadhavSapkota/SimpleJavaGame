import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby2 extends Actor
{
    /**
     * Act - do whatever the baby2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        if(Greenfoot.isKeyDown("7"))
      {
          Actor baby2_a = ( (baby2) getWorld().getObjects(baby2.class).get(1));
          baby2_a.setLocation(baby2_a.getX(), baby2_a.getY() - 1);
      }
     
      if (Greenfoot.isKeyDown("1"))
      {
          Actor baby2_a = ( (baby2) getWorld().getObjects(baby2.class).get(1));
          baby2_a.setLocation(baby2_a.getX(), baby2_a.getY() + 1);
      
      }  
       if(Greenfoot.isKeyDown("8"))
      {
          Actor baby2_a = ( (baby2) getWorld().getObjects(baby2.class).get(0));
          baby2_a.setLocation(baby2_a.getX(), baby2_a.getY() - 1);
      }
     
      if (Greenfoot.isKeyDown("2"))
      {
          Actor baby2_a = ( (baby2) getWorld().getObjects(baby2.class).get(0));
          baby2_a.setLocation(baby2_a.getX(), baby2_a.getY() + 1);
      
      }  
       if(Greenfoot.isKeyDown("9"))
      {
          Actor baby2_a = ( (baby2) getWorld().getObjects(baby2.class).get(2));
          baby2_a.setLocation(baby2_a.getX(), baby2_a.getY() - 1);
      }
     
      if (Greenfoot.isKeyDown("3"))
      {
          Actor baby2_a = ( (baby2) getWorld().getObjects(baby2.class).get(2));
          baby2_a.setLocation(baby2_a.getX(), baby2_a.getY() + 1);
      
      }  
    }    
}
