/* INSERT CODE HERE */

/* Starter Code */
/*
	
	An example of a Java Applet

*/

import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*;

public class MU_JApplet extends JApplet implements ActionListener {

    
    private JButton upButton, downButton, leftButton, rightButton;
    
    
    public void init() {
        
            Container contentPane = this.getContentPane();
	    contentPane.setLayout(null);
            contentPane.setBackground(Color.YELLOW);
	
	    // instantiate and place swim buttons
	    leftButton = new JButton("Move Left");
	    leftButton.setBounds(20, 15, 100, 20);
	    leftButton.addActionListener(this);
	    add(leftButton);
	    
	    rightButton = new JButton("Move Right");
	    rightButton.setBounds(260, 15, 100, 20);
	    rightButton.addActionListener(this);
	    add(rightButton);

            upButton = new JButton("Move Up");
	    upButton.setBounds(140, 5, 100, 20);
	    upButton.addActionListener(this);
	    add(upButton);

            downButton = new JButton("Move Down");
	    downButton.setBounds(140, 25, 100, 20);
	    downButton.addActionListener(this);
	    add(downButton);
	    
    	} // end of init()
	
    public void paint( Graphics g ) {
            
            super.paint(g);
	
            g.setColor(Color.black);
            g.drawLine(0, 50, 600, 50);
        
       
        
	} // end of paint()
	
    public void actionPerformed( ActionEvent e ) {
    
        Object source = e.getSource();
    
        if ( source.equals(leftButton) ) {
            System.out.println("Left Button Clicked");
        } // end if

        if ( source.equals(rightButton) ) {
            System.out.println("Right Button Clicked");
        } // end if

        if ( source.equals(upButton) ) {
            System.out.println("Up Button Clicked");
        } // end if

        if ( source.equals(downButton) ) {
            System.out.println("Down Button Clicked");
        } // end if
       
        repaint();
    } // end of actionPerformed()
    

} // end of MUJApplet class

