/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Mia Karisma Haq
 */
public class Obstacle extends GameObject
{
    /**
     * Constructor.
     */
    
    // Default constructor.
    public Obstacle()
    {
        super(0, 0, 30, 30, "Obstacle");
    }
    
    // Constructor with obstacle position.
    public Obstacle(int x, int y)
    {
        super(x, y, 30, 30, "Obstacle");
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics object)
    {
        // Set obstacle shape.
        object.setColor(Color.decode("#FFFF00"));
        object.fillRect(x, y, 30, 30);
    }
    
    @Override
    public void loop()
    {
        // Initialize velocity, so object can move.
        this.x += this.velX;
        this.y += this.velY;
        
        // Initialize obstacle bound, so it won't get offset the display.
        x = Game.clamp(x, 0, (Game.width - 50));
        y = Game.clamp(y, 0, (Game.height - 70));
    }
}
