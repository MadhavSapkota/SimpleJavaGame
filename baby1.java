import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby1 extends Actor
{
    /**
     * Act - do whatever the baby1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if(Greenfoot.isKeyDown("q"))
      {
          Actor baby1_a = ( (baby1) getWorld().getObjects(baby1.class).get(1));
          baby1_a.setLocation(baby1_a.getX(), baby1_a.getY() - 1);
      }
     
      if (Greenfoot.isKeyDown("a"))
      {
          Actor baby1_a = ( (baby1) getWorld().getObjects(baby1.class).get(1));
          baby1_a.setLocation(baby1_a.getX(), baby1_a.getY() + 1);
      
      }  
      if(Greenfoot.isKeyDown("d"))
      {
          Actor baby1_b = ( (baby1) getWorld().getObjects(baby1.class).get(2));
          baby1_b.setLocation(baby1_b.getX(), baby1_b.getY() - 1);
      }
      if(Greenfoot.isKeyDown("c"))
      {
          Actor baby1_b = ( (baby1) getWorld().getObjects(baby1.class).get(2));
          baby1_b.setLocation(baby1_b.getX(), baby1_b.getY() + 1);
      }
     if(Greenfoot.isKeyDown("w"))
      {
          Actor baby1_c = ( (baby1) getWorld().getObjects(baby1.class).get(0));
          baby1_c.setLocation(baby1_c.getX(), baby1_c.getY() - 1);
      }
      if(Greenfoot.isKeyDown("s"))
      {
          Actor baby1_c = ( (baby1) getWorld().getObjects(baby1.class).get(0));
          baby1_c.setLocation(baby1_c.getX(), baby1_c.getY() + 1);
      }
    }
}
