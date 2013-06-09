/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Pixelweber RIG
 */
public class board extends JPanel implements ActionListener{
    bat b;
    apple a;
    Image img;
    Timer time;
    
    public board(){
        b = new bat();
        addKeyListener(new AL());
        setFocusable(true);
        ImageIcon i = new ImageIcon("C:/setting.jpg");
        img = i.getImage();
        time = new Timer(5, this);
        time.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        ArrayList apples = b.getApples();
        for(int w = 0; w < apples.size(); w++){
            apple m = (apple) apples.get(w);
            if(m.getVisible() == true) {
                m.move();
            }else {
                apples.remove(w);
            }
        }
        b.move();
        repaint();
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(img, 0 , 0, null);
        g2D.drawImage(b.getBat(), b.getX(), b.getY(), null);
        
        ArrayList apples = b.getApples();
        for(int w = 0; w < apples.size(); w++){
            apple m = (apple) apples.get(w);
            g2D.drawImage(m.getImage(), m.getX(), m.getY(), null);
        }
    }
    
    private class AL extends KeyAdapter{
        @Override
        public void keyReleased(KeyEvent e){
            b.keyReleased(e);
        }  
        @Override
        public void keyPressed(KeyEvent e){
            b.keyPressed(e);
        }
    }
}
