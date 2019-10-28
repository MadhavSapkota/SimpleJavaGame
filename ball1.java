import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball1 extends Actor
{
    private int oldEdge;
    
    /**
     * Act - do whatever the ball1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        Actor net = getOneIntersectingObject(barrier.class);
        if (net!=null)
        {
           
            move(1);
        }
       
         Actor baby_3 = getOneIntersectingObject(baby3.class);
        if (baby_3!=null)
        {
            turn(180);
            move(5);
        }
        Actor baby_4 = getOneIntersectingObject(baby4.class);
        if (baby_4!=null)
        {
            turn(180);
            move(5);
        }
        Actor baby_1 = getOneIntersectingObject(baby1.class);
        if (baby_1!=null)
        {
            turn(125);
            move(5);
            
        }
       
        Actor baby_2 = getOneIntersectingObject(baby2.class);
        if (baby_2!=null)
        {
            turn(135);
            move(5);
            
        }
        Actor bar3 = getOneIntersectingObject(bar3.class);
        if (bar3!=null)
        {
            turn(120);
            move(5);
            World myWorld = getWorld();
            MyWorld myworld = (MyWorld)myWorld;
            Counter counter= myworld.getCounter();
            counter.addScore();
           
        }
       Actor bar4 = getOneIntersectingObject(bar4.class);
        if (bar4!=null)
        {
            turn(120);
            move(5);
            World myWorld = getWorld();
            MyWorld myworld = (MyWorld)myWorld;
            Counter1 counter1= myworld.getCounter1();
            counter1.addScore();
           
        }
          Actor bar1 = getOneIntersectingObject(bar1.class);
        if (bar1!=null)
        {
            turn(120);
            move(5);
            World myWorld = getWorld();
            MyWorld3 myworld = (MyWorld3)myWorld;
            Counter counter= myworld.getCounter();
            counter.addScore();
           
        }
       Actor bar2 = getOneIntersectingObject(bar2.class);
        if (bar2!=null)
        {
            turn(120);
            move(5);
            World myWorld = getWorld();
            MyWorld3 myworld = (MyWorld3)myWorld;
            Counter1 counter1= myworld.getCounter1();
            counter1.addScore();
           
        }
        if(isAtEdge())
        {
            turn(145);
        }
       
    }
  
    
    
    


    
   }