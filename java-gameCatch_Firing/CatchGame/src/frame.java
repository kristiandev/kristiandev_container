/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;

/**
 *
 * @author Pixelweber RIG
 */
public class frame {
   public static void main (String[] args){
       JFrame frame = new JFrame("2d Game");
       frame.add(new board());
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1200, 365);
       frame.setVisible(true);
   } 
}
