import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * Title:        View
 * Description:  Ein GUI für die exitierenden Modell-Klassen. Die View hat den Kontroller.
 */

public class View  extends JFrame 
{
    JPanel myJPanel             = new JPanel();
    BorderLayout myBorderLayout = new BorderLayout();
    JButton [] button = new JButton[36]; 

    JButton stopButton         = new JButton();

    public View() {
        SController myController= new SController(this);

        getContentPane().setLayout(myBorderLayout);
        myJPanel.setLayout(new GridLayout(6,6));

        //Spezial Buttons
        stopButton.setText("Exit");
        stopButton.setBounds(new Rectangle(40, 700, 100, 50));
        stopButton.setActionCommand("Exit");
        stopButton.addActionListener(myController);    

        //Buttons Stones
        for (int x = 0; x < 6; ++x) {
            for (int y = 0; y < 6; ++y) {
                JButton button = new JButton();
                button.setActionCommand("Press"+x+"_"+y);
                button.addActionListener(myController);
                myJPanel.add(button);
            }
        }
   
        //Buttons Turn
        /*for (int x = 0; x < 4; ++x) {
            for (int y = 0; y < 2; ++y) {
                JButton turnbutton = new JButton();
                turnbutton.setActionCommand("Turn"+x+"_"+y);
                turnbutton.addActionListener(myController);
                myJPanel.add(turnbutton);
            }
        }
        */
        this.getContentPane().add(stopButton, BorderLayout.SOUTH);
        this.getContentPane().add(myJPanel, BorderLayout.CENTER);
    }
}

