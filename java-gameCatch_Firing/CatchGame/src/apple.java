
import java.awt.*;
import javax.swing.*;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pixelweber RIG
 */
public class apple{
    int x, y;
    Image img;
    boolean visible;
    
    public apple(int startX, int startY){
        x = startX;
        y = startY;
        ImageIcon newApple = new ImageIcon("C:/apple.png");
        img = newApple.getImage(); 
        visible = true;
    }
    
    public void move(){
        y = y + 2;
        if(y > 1200){
            visible = false;
        }
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public Image getImage(){
        return img;
    }
    
    public boolean getVisible(){
        return visible;
    }
}
