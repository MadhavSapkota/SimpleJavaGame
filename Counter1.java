import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Counter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter1 extends Actor
{
    int score=0;
    /**
     * Act - do whatever the Counter1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Player2: " + score, 25, Color.GREEN, Color.BLACK ));
    }    
    
    public void addScore()
    {
        score++;
        if(score == 10)
        {
            /*This section helps to find winner between two player when score reaches 10.*/
            getWorld().showText("GAME OVER... BABY2 WON", 300, 200);
            getWorld().showText("Press spacebar for next level",300,230);
        }
    }
}
