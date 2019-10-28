import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class info extends Actor
{
    /**
     * Act - do whatever the info wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public info()
    {
        GreenfootImage img = new GreenfootImage(100, 30);
        img.drawString ("press b for level2" ,3, 20);
        setImage (img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
