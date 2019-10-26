package com.company;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Main {

    static class DrawPanel extends JPanel implements ActionListener {
        BufferedImage bufferedImage;
        ScreenConverter sc;
        World world;
        private Timer timer;
        private long t;
        int w,h;
        DrawPanel(){
            sc = new ScreenConverter(0,10,10,10,getWidth(),getHeight());
            world = new World(new Field(new Vector2(10,10)),new Puck(1,1,new Vector2(5,5)));
            timer = new Timer(40,this);
            t = System.currentTimeMillis();
            timer.start();
        }
        @Override
        public void paint(Graphics g) {//todo make 2 timers
            w = getWidth();
            h = getHeight();
            bufferedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics2D = (Graphics2D) bufferedImage.getGraphics();
            world.draw(graphics2D,sc);
            //graphics2D.fillRect((int) (w*r.nextDouble()),(int)(h*r.nextDouble()),(int) (w*r.nextDouble()),(int)(h*r.nextDouble()));
            g.drawImage(bufferedImage,0,0,null);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            long now = System.currentTimeMillis();
            world.update((now - t)*0.001);
            t = now;
            repaint();
        }
    }
    public static void main(String[] args) {
        final DrawPanel myPanel = new DrawPanel();
        final JFrame frame = new JFrame();

        myPanel.setSize(800, 600);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(myPanel);
        frame.setVisible(true);
        myPanel.setVisible(true);
        myPanel.grabFocus();
    }
}
