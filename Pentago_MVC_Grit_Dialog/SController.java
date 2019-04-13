import java.awt.event.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 * Title:           Controller
 * Description:     Dies ist der Controller dieses Spiels.
 *                  Der Controller hat das Spiel und kennt die View.
 */

public class SController implements ActionListener
{
    private View myView;
    Spiel game = new Spiel();
    int aktiverSpieler = 1;

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
        if((aktiverSpieler % 2) == 1) {
            sourceButton.setBackground(Color.red);
        } else {
            sourceButton.setBackground(Color.blue);
        }
        aktiverSpieler++;
        //myView.dialog(game.win);
        if (game.win != 0) {
            JOptionPane.showMessageDialog(null, "Spieler "+game.win+" hat gewonnen!!!","", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

