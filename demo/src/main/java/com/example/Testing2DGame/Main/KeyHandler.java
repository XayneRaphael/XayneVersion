package com.example.Testing2DGame.Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener 
{

    public boolean upPressed, downPressed, leftPressed, rightPressed;
    @Override
    public void keyTyped(KeyEvent e) 
    {
        
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        int code = e.getKeyCode(); // Returns the integer keyCode associated with the key in this event
        
        if(code == KeyEvent.VK_UP)
        {
            upPressed = true;
        }

        if(code == KeyEvent.VK_DOWN)
        {
            downPressed = true;
        }

        if(code == KeyEvent.VK_LEFT)
        {
            leftPressed = true;
        }

        if(code == KeyEvent.VK_RIGHT)
        {
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_UP)
        {
            upPressed = false;
        }

        if(code == KeyEvent.VK_DOWN)
        {
            downPressed = false;
        }

        if(code == KeyEvent.VK_LEFT)
        {
            leftPressed = false;
        }

        if(code == KeyEvent.VK_RIGHT)
        {
            rightPressed = false;
        }
    }
    
}
