import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * Title:        View
 * Description:  Ein GUI für die exitierenden Modell-Klassen. Die View hat den Kontroller.
 */

public class View  extends JFrame 
{
    JPanel my1JPanel             = new JPanel();
    JPanel my2JPanel             = new JPanel();
    JPanel my3JPanel             = new JPanel();
    JPanel my4JPanel             = new JPanel();
    BorderLayout myBorderLayout  = new BorderLayout();
    JButton stopButton           = new JButton();
    JLabel jLabel1               = new JLabel();
    JButton button[][]           = new JButton[6][6];
    public View() {
        SController myController = new SController(this);
        this.setTitle("Menu");
        getContentPane().setLayout(myBorderLayout);
        my1JPanel.setLayout(new GridLayout(6,6));
        my2JPanel.setLayout(new GridLayout(2,2));
        my3JPanel.setLayout(new GridLayout(1,1));
        my4JPanel.setLayout(new GridLayout(1,1));
        //Spezial Buttons
        stopButton.setText("Exit");
        stopButton.setBounds(new Rectangle(40, 700, 100, 50));
        stopButton.setActionCommand("Exit");
        stopButton.addActionListener(myController);   

        setAktivePlayer(1);

        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                button[i][j]             = new JButton();
            }
        }

        //Buttons Grid
        for (int x = 0; x < 6; ++x) {
            for (int y = 0; y < 6; ++y) {
                button[x][y].setActionCommand("Press"+x+"_"+y);
                button[x][y].addActionListener(myController);
                my1JPanel.add(button[x][y]);
            }
        }

        //Buttons Turn
        for (int x = 0; x < 4; ++x) {
            JButton Pbutton = new JButton();
            Pbutton.setActionCommand("Panel"+x);
            Pbutton.addActionListener(myController);
            my2JPanel.add(Pbutton);
        } 
        //Buttons TurnDirection
        for (int x = 0; x < 2; ++x) {
            JButton Tbutton = new JButton();
            Tbutton.setActionCommand("Turn"+x);
            Tbutton.addActionListener(myController);
            my3JPanel.add(Tbutton);
        }
        //Buttons Menu
        for (int x = 0; x < 2; ++x) {
        JButton Mbutton = new JButton();
        Mbutton.setActionCommand("Menu"+x);
            if (x==0) {
            Mbutton.setText("Gegen KI");
            }
        else {
            Mbutton.setText("2 Spieler");
            }
        Mbutton.addActionListener(myController);
        my4JPanel.add(Mbutton);
        }
        this.getContentPane().add(jLabel1, BorderLayout.NORTH);
        this.getContentPane().add(stopButton, BorderLayout.SOUTH);
        this.getContentPane().add(my4JPanel, BorderLayout.CENTER);
    }

    public void toTurn(){
        ((Component)my2JPanel).setFocusable(true);
        getContentPane().removeAll();
        getContentPane().invalidate();
        getContentPane().add(my2JPanel, BorderLayout.CENTER);
        getContentPane().revalidate();
        my2JPanel.grabFocus();
        repaint();
        this.setTitle("turn panel");
    }

    public void toTurnDir(){
        ((Component)my3JPanel).setFocusable(true);
        getContentPane().removeAll();
        getContentPane().invalidate();
        getContentPane().add(my3JPanel, BorderLayout.CENTER);
        getContentPane().revalidate();
        my3JPanel.grabFocus();
        repaint();
        this.setTitle("turn direction");
    }

    public void toBoard(){
        ((Component)my1JPanel).setFocusable(true);
        getContentPane().removeAll();
        getContentPane().invalidate();
        getContentPane().add(my1JPanel, BorderLayout.CENTER);
        getContentPane().add(jLabel1, BorderLayout.NORTH);
        getContentPane().add(stopButton, BorderLayout.SOUTH);
        getContentPane().revalidate();
        my1JPanel.grabFocus();
        repaint();
        this.setTitle("game board");
    }
    
        public void toMenu(){
        ((Component)my3JPanel).setFocusable(true);
        getContentPane().removeAll();
        getContentPane().invalidate();
        getContentPane().add(my3JPanel, BorderLayout.CENTER);
        getContentPane().revalidate();
        my3JPanel.grabFocus();
        repaint();
        this.setTitle("Menu");
    }

    public void setAktivePlayer(int aktivePlayer) {
        jLabel1.setText("Spieler: "+aktivePlayer);
    }

} 

