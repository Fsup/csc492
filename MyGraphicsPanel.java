/*
 * A simple GraphicsPanel that uses a paintComponent method to draw
 * something based on the values of two int data members.
 * 
 * Note that both moveToLeft() and moveToRight() have repaint();
 * at the end to force the screen to be redrawn using new value for theX.
 * 
 * Finally, the user can click on the GraphicsPanel to see the x, y values.
 * This is intended to be an aid in programming where things might be drawn.
 * See mousePressed method.
 */


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class MyGraphicsPanel extends JPanel implements MouseListener{
    
    
    private int theX, theY;
    private boolean hasBica = false;
    private boolean hasHartshorn;
    private boolean hasShields;
    private boolean hasHPCC;
    private boolean hasMcMaster;
    private boolean hasKetcham;
    
    public void setHasBica(boolean hasBica) {
        this.hasBica = hasBica;
        repaint();
    }

    public void setHasShields(boolean hasShields) {
        this.hasShields = hasShields;
        repaint();
    }

    public void setHasHPCC(boolean hasHPCC) {
        this.hasHPCC = hasHPCC;
        repaint();
    }

    public void setHasMcMaster(boolean hasMcMaster) {
        this.hasMcMaster = hasMcMaster;
        repaint();
    }

    public void setHasKetcham(boolean hasKetchem) {
        this.hasKetcham = hasKetchem;
        repaint();
    }


    public void setHasHartshorn(boolean hasHartshorn) {
        this.hasHartshorn = hasHartshorn;
        repaint();
    }
    
    public MyGraphicsPanel()
    {        
        addMouseListener(this);
    }

    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        BufferedImage temp = null;
        try {                
          //temp = ImageIO.read(new File("H:\\CSC320\\Lab04\\src\\Lab04\\umu.png"));
            temp = ImageIO.read(new URL("http://raider.mountunion.edu/~nelsonzj/CSC492/umu.png"));
       } catch (IOException ex) {
            System.out.println(" oops");
            // handle exception...
       }      

        g.drawImage(temp, 0, 0, this);
        g.setColor(Color.green); 
        if(hasBica){
            g.fillOval(418,335,12,12); //Bica Ross
        }
        if(hasHartshorn){
            g.fillOval(367,544,12,12); //Hartshorn Town Houses
        }
        if(hasShields){
            g.fillOval(368,335,12,12); //Shields
        }
        if(hasHPCC){
            g.fillOval(499,328,12,12); //HPCC
        }
        if(hasMcMaster){
            g.fillOval(555,312,12,12); //McMaster
        }
        if(hasKetcham){
            g.fillOval(596,312,12,12); //Ketchem
        }
       
//        g.fillOval(367,544,12,12); //Hartshorn Town Houses
//        g.fillOval(368,335,12,12); //Shields
//        g.fillOval(418,335,12,12); //Bica Ross
//        g.fillOval(499,328,12,12); //HPCC
//        g.fillOval(555,312,12,12); //McMaster
//        g.fillOval(596,312,12,12); //Ketchem
//        g.drawLine(368, 338, 418, 338);      
            
    }

    @Override
    public void mousePressed(MouseEvent e) {
         int x = e.getX();
        int y = e.getY();
        System.out.println(x+"  "+y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
