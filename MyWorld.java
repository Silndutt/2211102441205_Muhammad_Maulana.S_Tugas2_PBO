import greenfoot.*; 
import java.util.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        super(800, 600, 1); 
        this.setPaintOrder(Burung.class);
        addObject(new Burung(),200,500); 
        Random rnd = new Random();
        for (int i=0; i<5; i++){
            int x = rnd.nextInt(this.getWidth()-1);
            int y = rnd.nextInt(this.getHeight()-1);
            Awan awan1 = new Awan();
            awan1.setRotation(75*rnd.nextInt(1));
            this.addObject(awan1, x, y);
        }
    }
}
