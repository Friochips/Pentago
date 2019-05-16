import java.util.*;
public class Game
{
/**
 * Mit der Erzeugung der Klasse Spiel wird das gameBoard und zwei Player erzeugt.
 */
GameBoard gameBoard = new GameBoard();
Player Player1 = new Player(gameBoard);
Player Player2 = new Player(gameBoard);
int turn = 2;
int winner = 0;
int panel;


public void press(int x, int y) {
    if (win((turn % 2)+1) == false ) {       
 
    if((turn % 2)+1 == 1) {
    Player1.setStone((turn % 2)+1, x, y);    
    win(1);
    }
               
    if((turn % 2)+1 == 2) {    
    Player2.setStone((turn % 2)+1, x, y); 
    win(2);
    }  
    turn++;
    
    System.out.print("    0    1    2    3    4    5\n");          
    
    for(int p=0; p < 6; p++) 
    {
        System.out.print (x+" ");
        for(int o=0; o < 6; o++) { 
                System.out.print("| " + gameBoard.getGameBoard()[p][o] + " |");  
        }
        System.out.println("\n");  
    }    
}    
}

public void turn(int direction) {
    if (win((turn % 2)) == false ) {
        if((turn % 2)+1 == 1) {
            Player1.turn(panel,direction);
            win(1);
        }
        if((turn % 2)+1 == 2) {
            Player2.turn(panel,direction);
            win(2);
        }
    }
    turn++;
}

/**
 * Hier wird überprüft ob ein Spieler gewonnen hat.
 */
public boolean win(int Player) {
    for (int i=0;i<6;i++) {
        for (int j=0; j<6;j++) {
            if (horizontal(Player,i,j) || vertikal(Player,i,j) || schrägLinksOben(Player,i,j) || schrägRechtsOben(Player,i,j)) {
                System.out.println("Player " +Player+ " hat gewonnen");
                win(Player);
                return true;
                    
            }
        }
    }
    return false;
}

/**
 * Hier wird überprüft ob ein Spieler eine Reihe mit Kugeln in der Horizontalen erspielt hat, also gewonnen hat.
 */
public boolean vertikal(int Player,int i,int j) {
    if (j>1) {
    return false;
    }
    if (gameBoard.getGameBoard()[i][j]==Player && gameBoard.getGameBoard()[i][j+1]==Player && gameBoard.getGameBoard()[i][j+2]==Player && gameBoard.getGameBoard()[i][j+3]==Player && gameBoard.getGameBoard()[i][j+4]==Player) {
        return true;
    }
    else return false;
}

/**
 * Hier wird überprüft ob ein Spieler eine Reihe mit Kugeln in der Vertikalen erspielt hat, also gewonnen hat.
 */
public boolean horizontal(int Player,int i, int j) {
        if (i>1) {
    return false;
    }
    if (gameBoard.getGameBoard()[i][j]==Player && gameBoard.getGameBoard()[i+1][j]==Player && gameBoard.getGameBoard()[i+2][j]==Player && gameBoard.getGameBoard()[i+3][j]==Player && gameBoard.getGameBoard()[i+4][j]==Player) {
        return true;
    }
    else return false;
}

/**
 * Hier wird überprüft ob ein Spieler eine Reihe mit Kugeln von oben links nach unten rechts erspielt hat, also gewonnen hat.
 */
public boolean schrägRechtsOben(int Player, int i, int j) {
    if (j>1 || i<4) {
        return false;
    }
    if (gameBoard.getGameBoard()[i][j]==Player && gameBoard.getGameBoard()[i-1][j+1]==Player && gameBoard.getGameBoard()[i-2][j+2]==Player && gameBoard.getGameBoard()[i-3][j+3]==Player && gameBoard.getGameBoard()[i-4][j+4]==Player) {
        return true;
    }
    else return false;
}
/**
 * Hier wird überprüft ob ein Spieler eine Reihe mit Kugeln von oben rechts nach unten links erspielt hat, also gewonnen hat.
 */
public boolean schrägLinksOben(int Player, int i, int j) {
    if (j>1 || i>1) {
        return false;
    }
    if (gameBoard.getGameBoard()[j][i]==Player && gameBoard.getGameBoard()[j+1][i+1]==Player && gameBoard.getGameBoard()[j+2][i+2]==Player && gameBoard.getGameBoard()[j+3][i+3]==Player && gameBoard.getGameBoard()[j+4][i+4]==Player) {
        return true;
    }
    else return false;
}
public void winner(int Player) {
    winner = Player;
}
}
