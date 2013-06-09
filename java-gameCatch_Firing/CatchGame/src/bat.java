/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Pixelweber RIG
 */
public class bat {
    int x, y, dx, dy;
    Image bat_image;
    static ArrayList apples;
    
    public bat(){
        ImageIcon i = new ImageIcon("C://bat.png");
        bat_image = i.getImage();
         x = 200;
         y = 500;
         apples = new ArrayList();
    }
    
    public void move(){
        x = x + dx;
        y = y + dy;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public Image getBat(){
        return bat_image;
    }
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT) dx = -1;
        if(key == KeyEvent.VK_RIGHT) dx = 1;
        if(key == KeyEvent.VK_UP) dy = -1;
        if(key == KeyEvent.VK_DOWN) dy = 1;
        if(key == KeyEvent.VK_SPACE){
            fire();
        }
    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        dx = 0;
        dy = 0;
    }
    
    public void fire(){
        apple z = new apple(x + 37, y + 30);
        apples.add(z);
    }
    
    public ArrayList getApples(){
        return apples;
    }
}