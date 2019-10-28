import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld1 extends World
{
    
    Counter counter = new Counter();
    Counter1 counter1 = new Counter1();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //this chunck of code should not be changes and MUST be included
        //in your solution
        super(600, 400, 1);
        for (int loop=0; loop<20; loop=loop+1)
        {
            addObject(new barrier(), 300, 20*loop);
        }
        addObject(new baby3(), 150, 200);
        addObject(new baby4(), 450, 200);
        //End of code that must be included in your solution

        addObject(new ball1(), 200,200);

        prepare();
    }
    
    
    public void act()
    {
        if(Greenfoot.isKeyDown("b"))
        Greenfoot.setWorld(new MyWorld());
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   
        info info = new info();
        addObject(info,225,39);
        info.setLocation(299,38);
    }
}
