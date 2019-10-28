import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    Counter counter = new Counter();
    Counter1 counter1 = new Counter1();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //this chunck of code should not be changes and MUST be included
        //in your solution
        super(600, 400, 1);
        for (int loop=0; loop<20; loop=loop+1)
        {
            addObject(new barrier(), 300, 20*loop);
        }
        addObject(new baby1(), 150, 200);
        addObject(new baby2(), 450, 200);
        //End of code that must be included in your solution

        addObject(new ball1(), 200,200);

        prepare();
    }
    
    public Counter getCounter()
    {
        return counter;
    }
    
    public Counter1 getCounter1()
    {
        return counter1;
    }
     public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        Greenfoot.setWorld(new MyWorld3());
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   
        addObject(counter, 100, 40);
        addObject(counter1, 481, 46);
        baby1 baby1 = new baby1();
        addObject(baby1,152,94);
        baby1 baby12 = new baby1();
        addObject(baby12,157,316);
        baby2 baby2 = new baby2();
        addObject(baby2,455,103);
        baby2 baby22 = new baby2();
        addObject(baby22,459,316);
        counter.setLocation(75,42);
        counter1.setLocation(489,40);
        baby2 baby23 = new baby2();
        addObject(baby23,540,208);
        baby1 baby13 = new baby1();
        addObject(baby13,62,214);
        removeObject(baby13);
        removeObject(baby23);
        bar1 bar1 = new bar1();
        addObject(bar1,553,213);
        bar1.setLocation(581,213);
        bar2 bar2 = new bar2();
        addObject(bar2,27,207);
        bar2.setLocation(19,205);
        bar2.setLocation(19,208);
        bar2.setLocation(19,214);
        bar3 bar3 = new bar3();
        addObject(bar3,583,205);
        bar4 bar4 = new bar4();
        addObject(bar4,25,211);
        bar4.setLocation(19,211);
        bar4.setLocation(46,152);
        removeObject(bar2);
        bar3.setLocation(482,176);
        removeObject(bar1);
        bar3.setLocation(581,207);
        bar4.setLocation(19,211);
    }
}
