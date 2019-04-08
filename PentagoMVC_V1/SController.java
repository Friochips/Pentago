import java.awt.event.*;
import java.awt.*;
/**
 * Title:           Controller
 * Description:     Dies ist der Controller dieses Spiels.
 *                  Der Controller hat das Spiel und kennt die View.
 */

public class SController implements ActionListener
{
    private View myView;
    Spiel game = new Spiel();
    int Spieler = 1;
    public SController(View pView)
    {
        myView = pView;
    }

    public void actionPerformed (ActionEvent e)
    {
        String cmd = e.getActionCommand();
        
        if (cmd.equals("Press1")) 
        {
            game.Press(0,0);
            if((Spieler % 2) == 1) {
             myView.Setzen1Button.setBackground(Color.red);
            }
            else {
                myView.Setzen1Button.setBackground(Color.blue);
            }
            Spieler++;
        }
        else if (cmd.equals("Press2"))
        {
           game.Press(0,1);
           if((Spieler % 2) == 1) {
             myView.Setzen2Button.setBackground(Color.red);
            }
           else {
                myView.Setzen2Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press3"))
        {
           game.Press(0,2);
           if((Spieler % 2) == 1) {
             myView.Setzen3Button.setBackground(Color.red);
            }
           else {
                myView.Setzen3Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press4"))
        {
           game.Press(0,3);
           if((Spieler % 2) == 1) {
             myView.Setzen4Button.setBackground(Color.red);
            }
           else {
                myView.Setzen4Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
                else if (cmd.equals("Press5"))
        {
           game.Press(0,4);
           if((Spieler % 2) == 1) {
             myView.Setzen5Button.setBackground(Color.red);
            }
           else {
                myView.Setzen5Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
                else if (cmd.equals("Press6"))
        {
           game.Press(0,5);
           if((Spieler % 2) == 1) {
             myView.Setzen6Button.setBackground(Color.red);
            }
           else {
                myView.Setzen6Button.setBackground(Color.blue);
           }
           Spieler ++;
        }        
        //Reihe 2        
        else if (cmd.equals("Press2_1")) 
        {
            game.Press(1,0);
                       if((Spieler % 2) == 1) {
             myView.Setzen2_1Button.setBackground(Color.red);
            }
           else {
                myView.Setzen2_1Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press2_2"))
        {
           game.Press(1,1);
                      if((Spieler % 2) == 1) {
             myView.Setzen2_2Button.setBackground(Color.red);
            }
           else {
                myView.Setzen2_2Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press2_3"))
        {
           game.Press(1,2);
                      if((Spieler % 2) == 1) {
             myView.Setzen2_3Button.setBackground(Color.red);
            }
           else {
                myView.Setzen2_3Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press2_4"))
        {
           game.Press(1,3);
                      if((Spieler % 2) == 1) {
             myView.Setzen2_4Button.setBackground(Color.red);
            }
           else {
                myView.Setzen2_4Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
                else if (cmd.equals("Press2_5"))
        {
           game.Press(1,4);
                      if((Spieler % 2) == 1) {
             myView.Setzen2_5Button.setBackground(Color.red);
            }
           else {
                myView.Setzen2_5Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
                else if (cmd.equals("Press2_6"))
        {
           game.Press(1,5);
                      if((Spieler % 2) == 1) {
             myView.Setzen2_6Button.setBackground(Color.red);
            }
           else {
                myView.Setzen2_6Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        //Reihe 3        
        else if (cmd.equals("Press3_1")) 
        {
            game.Press(2,0);
                                  if((Spieler % 2) == 1) {
             myView.Setzen3_1Button.setBackground(Color.red);
            }
           else {
                myView.Setzen3_1Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press3_2"))
        {
           game.Press(2,1);
                                 if((Spieler % 2) == 1) {
             myView.Setzen3_2Button.setBackground(Color.red);
            }
           else {
                myView.Setzen3_2Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press3_3"))
        {
           game.Press(2,2);
           if((Spieler % 2) == 1) {
             myView.Setzen3_3Button.setBackground(Color.red);
            }
           else {
                myView.Setzen3_3Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press3_4"))
        {
           game.Press(2,3);
            if((Spieler % 2) == 1) {
             myView.Setzen3_4Button.setBackground(Color.red);
            }
           else {
                myView.Setzen3_4Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
                else if (cmd.equals("Press3_5"))
        {
           game.Press(2,4);
           if((Spieler % 2) == 1) {
             myView.Setzen3_5Button.setBackground(Color.red);
            }
           else {
                myView.Setzen3_5Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
                else if (cmd.equals("Press3_6"))
        {
           game.Press(2,5);
                                 if((Spieler % 2) == 1) {
             myView.Setzen3_6Button.setBackground(Color.red);
            }
           else {
                myView.Setzen3_6Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        //Reihe 4        
        else if (cmd.equals("Press4_1")) 
        {
            game.Press(3,0);
                                             if((Spieler % 2) == 1) {
             myView.Setzen4_1Button.setBackground(Color.red);
            }
           else {
                myView.Setzen4_1Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press4_2"))
        {
           game.Press(3,1);
                                            if((Spieler % 2) == 1) {
             myView.Setzen4_2Button.setBackground(Color.red);
            }
           else {
                myView.Setzen4_2Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press4_3"))
        {
           game.Press(3,2);
                                            if((Spieler % 2) == 1) {
             myView.Setzen4_3Button.setBackground(Color.red);
            }
           else {
                myView.Setzen4_3Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press4_4"))
        {
           game.Press(3,3);
                                            if((Spieler % 2) == 1) {
             myView.Setzen4_4Button.setBackground(Color.red);
            }
           else {
                myView.Setzen4_4Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
                else if (cmd.equals("Press4_5"))
        {
           game.Press(3,4);
                                            if((Spieler % 2) == 1) {
             myView.Setzen4_5Button.setBackground(Color.red);
            }
           else {
                myView.Setzen4_5Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
                else if (cmd.equals("Press4_6"))
        {
           game.Press(3,5);
           if((Spieler % 2) == 1) {
             myView.Setzen4_6Button.setBackground(Color.red);
            }
           else {
                myView.Setzen4_6Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        //Reihe 5        
        else if (cmd.equals("Press5_1")) 
        {
            game.Press(4,0);
                       if((Spieler % 2) == 1) {
             myView.Setzen5_1Button.setBackground(Color.red);
            }
           else {
                myView.Setzen5_1Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press5_2"))
        {
           game.Press(4,1);
                      if((Spieler % 2) == 1) {
             myView.Setzen5_2Button.setBackground(Color.red);
            }
           else {
                myView.Setzen5_2Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press5_3"))
        {
           game.Press(4,2);
                      if((Spieler % 2) == 1) {
             myView.Setzen5_3Button.setBackground(Color.red);
            }
           else {
                myView.Setzen5_3Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press5_4")){
           game.Press(4,3);
                      if((Spieler % 2) == 1) {
             myView.Setzen5_4Button.setBackground(Color.red);
            }
           else {
                myView.Setzen5_4Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
                else if (cmd.equals("Press5_5"))
        {
           game.Press(4,4);
                      if((Spieler % 2) == 1) {
             myView.Setzen5_5Button.setBackground(Color.red);
            }
           else {
                myView.Setzen5_5Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
                else if (cmd.equals("Press5_6"))
        {
           game.Press(4,5);
                      if((Spieler % 2) == 1) {
             myView.Setzen5_6Button.setBackground(Color.red);
            }
           else {
                myView.Setzen5_6Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        //Reihe 6        
        else if (cmd.equals("Press6_1")) 
        {
            game.Press(5,0);
                                  if((Spieler % 2) == 1) {
             myView.Setzen6_1Button.setBackground(Color.red);
            }
           else {
                myView.Setzen6_1Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press6_2"))
        {
           game.Press(5,1);
                                 if((Spieler % 2) == 1) {
             myView.Setzen6_2Button.setBackground(Color.red);
            }
           else {
                myView.Setzen6_2Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press6_3"))
        {
           game.Press(5,2);
                                 if((Spieler % 2) == 1) {
             myView.Setzen6_3Button.setBackground(Color.red);
            }
           else {
                myView.Setzen6_3Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        else if (cmd.equals("Press6_4"))
        {
           game.Press(5,3);
                                 if((Spieler % 2) == 1) {
             myView.Setzen6_4Button.setBackground(Color.red);
            }
           else {
                myView.Setzen6_4Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
                else if (cmd.equals("Press6_5"))
        {
           game.Press(5,4);
                                 if((Spieler % 2) == 1) {
             myView.Setzen6_5Button.setBackground(Color.red);
            }
           else {
                myView.Setzen6_5Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
                else if (cmd.equals("Press6_6"))
        {
           game.Press(5,5);
                                 if((Spieler % 2) == 1) {
             myView.Setzen6_6Button.setBackground(Color.red);
            }
           else {
                myView.Setzen6_6Button.setBackground(Color.blue);
           }
           Spieler ++;
        }
        
        else if (cmd.equals("Exit")) 
        {
            System.exit(0);
        }
  }
}

