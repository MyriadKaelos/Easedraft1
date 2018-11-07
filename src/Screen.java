import jdk.nashorn.internal.objects.annotations.Function;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Screen extends JPanel {
    int res;
    int width;
    int height;
    public Screen(int width,int height,int res) {
        setSize(width,height);
        setFocusable(true);
        this.res = res;
        System.out.println("Pixelated Graphics");
        System.out.println(res + "px Length pixels.");
        System.out.println("width: " + width + ", height: " + height);
        this.width = width;
        this.height = height;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // paint background
        setBackground(Color.WHITE);
        Graphics2D g2d = (Graphics2D)g;
        paintStuff(g2d);
    }
    public void paintStuff(Graphics2D g2d) {
        for(int i = 0; i < width/res; i++) {
            for(int o = 0; o < height/res; o++) {
                Random r = new Random();
                Color c = Color.getHSBColor(r.nextFloat(),r.nextFloat(),r.nextFloat());
                p(i,o,c,g2d);
            }
        }
    }
    public void p(int x, int y, Color color,Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillRect(x*res,y*res,res,res);
    }
}
