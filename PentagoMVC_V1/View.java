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
  
    JLabel jLabel1              = new JLabel();
    JLabel jLabel2              = new JLabel();
  
    JButton stopButton          = new JButton();
    JButton Setzen1Button     = new JButton();
    JButton Setzen2Button     = new JButton();
    JButton Setzen3Button     = new JButton();
    JButton Setzen4Button     = new JButton();
    JButton Setzen5Button     = new JButton();
    JButton Setzen6Button     = new JButton();
    
    JButton Setzen2_1Button     = new JButton();
    JButton Setzen2_2Button     = new JButton();
    JButton Setzen2_3Button     = new JButton();
    JButton Setzen2_4Button     = new JButton();
    JButton Setzen2_5Button     = new JButton();
    JButton Setzen2_6Button     = new JButton();
    
    JButton Setzen3_1Button     = new JButton();
    JButton Setzen3_2Button     = new JButton();
    JButton Setzen3_3Button     = new JButton();
    JButton Setzen3_4Button     = new JButton();
    JButton Setzen3_5Button     = new JButton();
    JButton Setzen3_6Button     = new JButton();
    
    JButton Setzen4_1Button     = new JButton();
    JButton Setzen4_2Button     = new JButton();
    JButton Setzen4_3Button     = new JButton();
    JButton Setzen4_4Button     = new JButton();
    JButton Setzen4_5Button     = new JButton();
    JButton Setzen4_6Button     = new JButton();
    
    JButton Setzen5_1Button     = new JButton();
    JButton Setzen5_2Button     = new JButton();
    JButton Setzen5_3Button     = new JButton();
    JButton Setzen5_4Button     = new JButton();
    JButton Setzen5_5Button     = new JButton();
    JButton Setzen5_6Button     = new JButton();
    
    JButton Setzen6_1Button     = new JButton();
    JButton Setzen6_2Button     = new JButton();
    JButton Setzen6_3Button     = new JButton();
    JButton Setzen6_4Button     = new JButton();
    JButton Setzen6_5Button     = new JButton();
    JButton Setzen6_6Button     = new JButton();
    
    public View() {
        SController myController= new SController(this);
        
        getContentPane().setLayout(myBorderLayout);
        myJPanel.setLayout(null);
        
        //Spezial Buttons
        stopButton.setText("Exit");
        stopButton.setBounds(new Rectangle(40, 700, 100, 50));
        stopButton.setActionCommand("Exit");
        stopButton.addActionListener(myController);    
        
        //Buttons Steine
        Setzen1Button.setBounds(new Rectangle(20, 150, 50, 50));
        Setzen1Button.setActionCommand("Press1");
        Setzen1Button.addActionListener(myController);
     
        Setzen2Button.setBounds(new Rectangle(90, 150, 50, 50));      
        Setzen2Button.setActionCommand("Press2");
        Setzen2Button.addActionListener(myController);
        
        Setzen3Button.setBounds(new Rectangle(160, 150, 50, 50));      
        Setzen3Button.setActionCommand("Press3");
        Setzen3Button.addActionListener(myController);
        
        Setzen4Button.setBounds(new Rectangle(230, 150, 50, 50));      
        Setzen4Button.setActionCommand("Press4");
        Setzen4Button.addActionListener(myController);
        
        Setzen5Button.setBounds(new Rectangle(300, 150, 50, 50));      
        Setzen5Button.setActionCommand("Press5");
        Setzen5Button.addActionListener(myController);
                
        Setzen6Button.setBounds(new Rectangle(370, 150, 50, 50));      
        Setzen6Button.setActionCommand("Press6");
        Setzen6Button.addActionListener(myController);
        
        //Reihe2
        Setzen2_1Button.setBounds(new Rectangle(20, 220, 50, 50));      
        Setzen2_1Button.setActionCommand("Press2_1");
        Setzen2_1Button.addActionListener(myController);
        
        Setzen2_2Button.setBounds(new Rectangle(90, 220, 50, 50));      
        Setzen2_2Button.setActionCommand("Press2_2");
        Setzen2_2Button.addActionListener(myController);
        
        Setzen2_3Button.setBounds(new Rectangle(160, 220, 50, 50));      
        Setzen2_3Button.setActionCommand("Press2_3");
        Setzen2_3Button.addActionListener(myController);
        
        Setzen2_4Button.setBounds(new Rectangle(230, 220, 50, 50));      
        Setzen2_4Button.setActionCommand("Press2_4");
        Setzen2_4Button.addActionListener(myController);
        
        Setzen2_5Button.setBounds(new Rectangle(300, 220, 50, 50));      
        Setzen2_5Button.setActionCommand("Press2_5");
        Setzen2_5Button.addActionListener(myController);
                
        Setzen2_6Button.setBounds(new Rectangle(370, 220, 50, 50));      
        Setzen2_6Button.setActionCommand("Press2_6");
        Setzen2_6Button.addActionListener(myController);
        
        //Reihe 3
        Setzen3_1Button.setBounds(new Rectangle(20, 290, 50, 50));      
        Setzen3_1Button.setActionCommand("Press3_1");
        Setzen3_1Button.addActionListener(myController);
        
        Setzen3_2Button.setBounds(new Rectangle(90, 290, 50, 50));      
        Setzen3_2Button.setActionCommand("Press3_2");
        Setzen3_2Button.addActionListener(myController);
        
        Setzen3_3Button.setBounds(new Rectangle(160, 290, 50, 50));      
        Setzen3_3Button.setActionCommand("Press3_3");
        Setzen3_3Button.addActionListener(myController);
        
        Setzen3_4Button.setBounds(new Rectangle(230, 290, 50, 50));      
        Setzen3_4Button.setActionCommand("Press3_4");
        Setzen3_4Button.addActionListener(myController);
        
        Setzen3_5Button.setBounds(new Rectangle(300, 290, 50, 50));      
        Setzen3_5Button.setActionCommand("Press3_5");
        Setzen3_5Button.addActionListener(myController);
                
        Setzen3_6Button.setBounds(new Rectangle(370, 290, 50, 50));      
        Setzen3_6Button.setActionCommand("Press3_6");
        Setzen3_6Button.addActionListener(myController);
        
        //Reihe 4
        Setzen4_1Button.setBounds(new Rectangle(20, 360, 50, 50));      
        Setzen4_1Button.setActionCommand("Press4_1");
        Setzen4_1Button.addActionListener(myController);
        
        Setzen4_2Button.setBounds(new Rectangle(90, 360, 50, 50));      
        Setzen4_2Button.setActionCommand("Press4_2");
        Setzen4_2Button.addActionListener(myController);
        
        Setzen4_3Button.setBounds(new Rectangle(160, 360, 50, 50));      
        Setzen4_3Button.setActionCommand("Press4_3");
        Setzen4_3Button.addActionListener(myController);
        
        Setzen4_4Button.setBounds(new Rectangle(230, 360, 50, 50));      
        Setzen4_4Button.setActionCommand("Press4_4");
        Setzen4_4Button.addActionListener(myController);
        
        Setzen4_5Button.setBounds(new Rectangle(300, 360, 50, 50));      
        Setzen4_5Button.setActionCommand("Press4_5");
        Setzen4_5Button.addActionListener(myController);
                
        Setzen4_6Button.setBounds(new Rectangle(370, 360, 50, 50));      
        Setzen4_6Button.setActionCommand("Press4_6");
        Setzen4_6Button.addActionListener(myController);
        
        //Reihe 5
        Setzen5_1Button.setBounds(new Rectangle(20, 430, 50, 50));      
        Setzen5_1Button.setActionCommand("Press5_1");
        Setzen5_1Button.addActionListener(myController);
        
        Setzen5_2Button.setBounds(new Rectangle(90, 430, 50, 50));      
        Setzen5_2Button.setActionCommand("Press5_2");
        Setzen5_2Button.addActionListener(myController);
        
        Setzen5_3Button.setBounds(new Rectangle(160, 430, 50, 50));      
        Setzen5_3Button.setActionCommand("Press5_3");
        Setzen5_3Button.addActionListener(myController);
        
        Setzen5_4Button.setBounds(new Rectangle(230, 430, 50, 50));      
        Setzen5_4Button.setActionCommand("Press5_4");
        Setzen5_4Button.addActionListener(myController);
        
        Setzen5_5Button.setBounds(new Rectangle(300, 430, 50, 50));      
        Setzen5_5Button.setActionCommand("Press5_5");
        Setzen5_5Button.addActionListener(myController);
                
        Setzen5_6Button.setBounds(new Rectangle(370, 430, 50, 50));      
        Setzen5_6Button.setActionCommand("Press5_6");
        Setzen5_6Button.addActionListener(myController);
        
        //Reihe 6
        Setzen6_1Button.setBounds(new Rectangle(20, 500, 50, 50));      
        Setzen6_1Button.setActionCommand("Press6_1");
        Setzen6_1Button.addActionListener(myController);
        
        Setzen6_2Button.setBounds(new Rectangle(90, 500, 50, 50));      
        Setzen6_2Button.setActionCommand("Press6_2");
        Setzen6_2Button.addActionListener(myController);
        
        Setzen6_3Button.setBounds(new Rectangle(160, 500, 50, 50));      
        Setzen6_3Button.setActionCommand("Press6_3");
        Setzen6_3Button.addActionListener(myController);
        
        Setzen6_4Button.setBounds(new Rectangle(230, 500, 50, 50));      
        Setzen6_4Button.setActionCommand("Press6_4");
        Setzen6_4Button.addActionListener(myController);
        
        Setzen6_5Button.setBounds(new Rectangle(300, 500, 50, 50));      
        Setzen6_5Button.setActionCommand("Press6_5");
        Setzen6_5Button.addActionListener(myController);
                
        Setzen6_6Button.setBounds(new Rectangle(370, 500, 50, 50));      
        Setzen6_6Button.setActionCommand("Press6_6");
        Setzen6_6Button.addActionListener(myController);
        
        
        
        //Jpanel
        myJPanel.setBackground(Color.white);
        myJPanel.add(jLabel1, null);
        myJPanel.add(jLabel2, null);
        myJPanel.add(stopButton, null);
        
        //Button Steine
        myJPanel.add(Setzen1Button, null);
        myJPanel.add(Setzen2Button, null);
        myJPanel.add(Setzen3Button, null);
        myJPanel.add(Setzen4Button, null);
        myJPanel.add(Setzen5Button, null);
        myJPanel.add(Setzen6Button, null);
        
        myJPanel.add(Setzen2_1Button, null);
        myJPanel.add(Setzen2_2Button, null);
        myJPanel.add(Setzen2_3Button, null);
        myJPanel.add(Setzen2_4Button, null);
        myJPanel.add(Setzen2_5Button, null);
        myJPanel.add(Setzen2_6Button, null);
        
        myJPanel.add(Setzen3_1Button, null);
        myJPanel.add(Setzen3_2Button, null);
        myJPanel.add(Setzen3_3Button, null);
        myJPanel.add(Setzen3_4Button, null);
        myJPanel.add(Setzen3_5Button, null);
        myJPanel.add(Setzen3_6Button, null);
        
        
        myJPanel.add(Setzen4_1Button, null);
        myJPanel.add(Setzen4_2Button, null);
        myJPanel.add(Setzen4_3Button, null);
        myJPanel.add(Setzen4_4Button, null);
        myJPanel.add(Setzen4_5Button, null);
        myJPanel.add(Setzen4_6Button, null);
        
        
        myJPanel.add(Setzen5_1Button, null);
        myJPanel.add(Setzen5_2Button, null);
        myJPanel.add(Setzen5_3Button, null);
        myJPanel.add(Setzen5_4Button, null);
        myJPanel.add(Setzen5_5Button, null);
        myJPanel.add(Setzen5_6Button, null);
        
        
        myJPanel.add(Setzen6_1Button, null);
        myJPanel.add(Setzen6_2Button, null);
        myJPanel.add(Setzen6_3Button, null);
        myJPanel.add(Setzen6_4Button, null);
        myJPanel.add(Setzen6_5Button, null);
        myJPanel.add(Setzen6_6Button, null);
        
        
        this.getContentPane().add(myJPanel, BorderLayout.CENTER);
  }

}

