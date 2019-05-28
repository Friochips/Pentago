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
    int aktivPlayer = 0;
    int section = 0;

    public SController(View pView)
    {
        myView = pView;
    }

    public void actionPerformed (ActionEvent e)
    {
    String cmd = e.getActionCommand();
    JButton sourceButton = ((JButton)e.getSource());

    if (sourceButton.getBackground() == Color.red || sourceButton.getBackground() == Color.blue) {
            return;
    }
    if (section == 3) {    
    game.turn(Integer.parseInt(cmd.substring(4)));
    if (game.getPlayer2().getKi() == true) {
        game.getPlayer2().kizug(); 
    }
    for(int p=0; p < 6; p++) {
            for(int o=0; o < 6; o++) { 
                if (game.gameBoard.getGameBoard()[p][o] == 1) {
                    myView.button[p][o].setBackground(Color.RED);
                }
                if (game.gameBoard.getGameBoard()[p][o] == 2) {
                    myView.button[p][o].setBackground(Color.BLUE);
                }
                if (game.gameBoard.getGameBoard()[p][o] ==0) {
                    myView.button[p][o].setBackground(null);
                }
        }
    }

    myView.toBoard();
    }
        if (section == 2) {
        game.setPanel(Integer.parseInt(cmd.substring(5)));
        myView.toTurnDir();
    }
    if (section == 1) {
        if (cmd.equals("Exit")) {
        System.exit(0);
    }
    game.press(Integer.parseInt(cmd.substring(5, 6)), Integer.parseInt(cmd.substring(7)));
    myView.toTurn();
    }
    if (section == 0) {
        if (cmd.equals("Menu0")) {
        game.getPlayer2().setKi(true);
        game.setKi(true);
    }
        myView.toBoard();
    }
    myView.setAktivePlayer(aktivPlayer  % 2 +1);
    aktivPlayer++;      
    if (game.getWinner() != 0) {
        JOptionPane.showMessageDialog(null, "Spieler "+game.getWinner()+" hat gewonnen!!!","", JOptionPane.INFORMATION_MESSAGE);
        myView.toBoard();
    }
    if (section < 3) {
    section++;
    }
    else {
    section = 1;
    } 
    }
}

