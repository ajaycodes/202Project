import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class ExplanationText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExplanationText extends Actor
{
       public ExplanationText(String text) {
      
       GreenfootImage g = new GreenfootImage(text, 30, Color.YELLOW , null);
       setImage(g);
       
      
       
    }
    /**
     * Act - do whatever the ExplanationText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //if(Greenfoot.mouseClicked(this)){
        //getWorld().removeObject(this);
    //}
    }    
}