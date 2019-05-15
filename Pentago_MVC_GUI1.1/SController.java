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
    Game game = new Game();
    int aktivPlayer = 1;
    int section = 1;

public SController(View pView)
    {
        myView = pView;
    }

    public void actionPerformed (ActionEvent e)
    {
    String cmd = e.getActionCommand();
            if (section == 3) {    
        game.turn(Integer.parseInt(cmd.substring(4)));
        myView.toBoard();
    }
        if (section == 2) {
        game.panel = (Integer.parseInt(cmd.substring(5)));
        myView.toTurnDir();
    }
        if (section == 1) {
        if (cmd.equals("Exit")) 
        {
            System.exit(0);
        }
        JButton sourceButton = ((JButton)e.getSource());
        if (sourceButton.getBackground() == Color.red || sourceButton.getBackground() == Color.blue) {
            return;
        }
        game.press(Integer.parseInt(cmd.substring(5, 6)), Integer.parseInt(cmd.substring(7)));
        if((aktivPlayer % 2) == 1) {
            sourceButton.setBackground(Color.red);            
        } else {
            sourceButton.setBackground(Color.blue);
        }
        myView.toTurn();
    }
    aktivPlayer++;        
    if (game.winner != 0) {
        JOptionPane.showMessageDialog(null, "Spieler "+game.winner+" hat gewonnen!!!","", JOptionPane.INFORMATION_MESSAGE);
    }
    if (section < 3) {
    section++;
    }
    else {
    section = 1;
    }
}
}

