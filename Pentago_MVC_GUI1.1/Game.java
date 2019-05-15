import java.util.*;
public class Game
{
/**
 * Mit der Erzeugung der Klasse Spiel wird das Spielfeld und zwei Spieler erzeugt.
 */
GameBoard Spielfeld = new GameBoard();
Player Player1 = new Player(Spielfeld);
Player Player2 = new Player(Spielfeld);
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
                System.out.print("| " + Spielfeld.getGameBoard()[p][o] + " |");  
        }
        System.out.println("\n");  
    }    
}    
}

public void turn(int richtung) {
    if (win((turn % 2)) == false ) {
        if((turn % 2)+1 == 1) {
            Player1.turn(panel,richtung);
            win(1);
        }
        if((turn % 2)+1 == 2) {
            Player2.turn(panel,richtung);
            win(2);
        }
    }
    turn++;
}

/**
 * Hier wird überprüft ob ein Spieler gewonnen hat.
 */
public boolean win(int Spieler) {
    for (int i=0;i<6;i++) {
        for (int j=0; j<6;j++) {
            if (horizontal(Spieler,i,j) || vertikal(Spieler,i,j) || schrägLinksOben(Spieler,i,j) || schrägRechtsOben(Spieler,i,j)) {
                System.out.println("Spieler " +Spieler+ " hat gewonnen");
                win(Spieler);
                return true;
                    
            }
        }
    }
    return false;
}

/**
 * Hier wird überprüft ob ein Spieler eine Reihe mit Kugeln in der Horizontalen erspielt hat, also gewonnen hat.
 */
public boolean vertikal(int Spieler,int i,int j) {
    if (j>1) {
    return false;
    }
    if (Spielfeld.getGameBoard()[i][j]==Spieler && Spielfeld.getGameBoard()[i][j+1]==Spieler && Spielfeld.getGameBoard()[i][j+2]==Spieler && Spielfeld.getGameBoard()[i][j+3]==Spieler && Spielfeld.getGameBoard()[i][j+4]==Spieler) {
        return true;
    }
    else return false;
}

/**
 * Hier wird überprüft ob ein Spieler eine Reihe mit Kugeln in der Vertikalen erspielt hat, also gewonnen hat.
 */
public boolean horizontal(int Spieler,int i, int j) {
        if (i>1) {
    return false;
    }
    if (Spielfeld.getGameBoard()[i][j]==Spieler && Spielfeld.getGameBoard()[i+1][j]==Spieler && Spielfeld.getGameBoard()[i+2][j]==Spieler && Spielfeld.getGameBoard()[i+3][j]==Spieler && Spielfeld.getGameBoard()[i+4][j]==Spieler) {
        return true;
    }
    else return false;
}

/**
 * Hier wird überprüft ob ein Spieler eine Reihe mit Kugeln von oben links nach unten rechts erspielt hat, also gewonnen hat.
 */
public boolean schrägRechtsOben(int Spieler, int i, int j) {
    if (j>1 || i<4) {
        return false;
    }
    if (Spielfeld.getGameBoard()[i][j]==Spieler && Spielfeld.getGameBoard()[i-1][j+1]==Spieler && Spielfeld.getGameBoard()[i-2][j+2]==Spieler && Spielfeld.getGameBoard()[i-3][j+3]==Spieler && Spielfeld.getGameBoard()[i-4][j+4]==Spieler) {
        return true;
    }
    else return false;
}
/**
 * Hier wird überprüft ob ein Spieler eine Reihe mit Kugeln von oben rechts nach unten links erspielt hat, also gewonnen hat.
 */
public boolean schrägLinksOben(int Spieler, int i, int j) {
    if (j>1 || i>1) {
        return false;
    }
    if (Spielfeld.getGameBoard()[j][i]==Spieler && Spielfeld.getGameBoard()[j+1][i+1]==Spieler && Spielfeld.getGameBoard()[j+2][i+2]==Spieler && Spielfeld.getGameBoard()[j+3][i+3]==Spieler && Spielfeld.getGameBoard()[j+4][i+4]==Spieler) {
        return true;
    }
    else return false;
}
public void winner(int Spieler) {
    winner = Spieler;
}
}
