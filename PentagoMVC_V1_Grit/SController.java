import java.awt.event.*;
import java.awt.*;
import javax.swing.JButton;
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
    int ButtonCtrl = 1;
    public SController(View pView)
    {
        myView = pView;
    }

    public void actionPerformed (ActionEvent e)
    {
        String cmd = e.getActionCommand();
        if (cmd.equals("Exit")) 
        {
            System.exit(0);
        }
        JButton sourceButton = ((JButton)e.getSource());
        if (sourceButton.getBackground() == Color.red || sourceButton.getBackground() == Color.blue) {
            return;
        }
        game.Press(Integer.parseInt(cmd.substring(5,6)), Integer.parseInt(cmd.substring(7)));
        if((Spieler % 2) == 1) {
            sourceButton.setBackground(Color.red);
        } else {
            sourceButton.setBackground(Color.blue);
        }
        Spieler++;
        
    }
}

