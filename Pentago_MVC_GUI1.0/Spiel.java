import java.util.*;
public class Spiel
{
/**
 * Mit der Erzeugung der Klasse Spiel wird das Spielfeld und zwei Spieler erzeugt.
 */
Spielbrett Spielfeld = new Spielbrett();
Spieler Spieler1 = new Spieler(Spielfeld);
Spieler Spieler2 = new Spieler(Spielfeld);
int zug = 2;
int win = 0;
int panel;


public void Press(int x, int y) {
    if (gewonnen((zug % 2)+1) == false ) {       
 
    if((zug % 2)+1 == 1) {
    Spieler1.setzeStein((zug % 2)+1, x, y);    
    gewonnen(1);
    }
               
    if((zug % 2)+1 == 2) {    
    Spieler2.setzeStein((zug % 2)+1, x, y); 
    gewonnen(2);
    }  
    zug++;
    
    System.out.print("    0    1    2    3    4    5\n");          
    
    for(int p=0; p < 6; p++) 
    {
        System.out.print (x+" ");
        for(int o=0; o < 6; o++) { 
                System.out.print("| " + Spielfeld.getSpielfeld()[p][o] + " |");  
        }
        System.out.println("\n");  
    }    
}    
}

public void Turn(int richtung) {
    if (gewonnen((zug % 2)) == false ) {
        if((zug % 2)+1 == 1) {
            Spieler1.Turn(panel,richtung);
            gewonnen(1);
        }
        if((zug % 2)+1 == 2) {
            Spieler2.Turn(panel,richtung);
            gewonnen(2);
        }
    }
    zug++;
}

/**
 * Hier wird überprüft ob ein Spieler gewonnen hat.
 */
public boolean gewonnen(int Spieler) {
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
    if (Spielfeld.getSpielfeld()[i][j]==Spieler && Spielfeld.getSpielfeld()[i][j+1]==Spieler && Spielfeld.getSpielfeld()[i][j+2]==Spieler && Spielfeld.getSpielfeld()[i][j+3]==Spieler && Spielfeld.getSpielfeld()[i][j+4]==Spieler) {
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
    if (Spielfeld.getSpielfeld()[i][j]==Spieler && Spielfeld.getSpielfeld()[i+1][j]==Spieler && Spielfeld.getSpielfeld()[i+2][j]==Spieler && Spielfeld.getSpielfeld()[i+3][j]==Spieler && Spielfeld.getSpielfeld()[i+4][j]==Spieler) {
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
    if (Spielfeld.getSpielfeld()[i][j]==Spieler && Spielfeld.getSpielfeld()[i-1][j+1]==Spieler && Spielfeld.getSpielfeld()[i-2][j+2]==Spieler && Spielfeld.getSpielfeld()[i-3][j+3]==Spieler && Spielfeld.getSpielfeld()[i-4][j+4]==Spieler) {
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
    if (Spielfeld.getSpielfeld()[j][i]==Spieler && Spielfeld.getSpielfeld()[j+1][i+1]==Spieler && Spielfeld.getSpielfeld()[j+2][i+2]==Spieler && Spielfeld.getSpielfeld()[j+3][i+3]==Spieler && Spielfeld.getSpielfeld()[j+4][i+4]==Spieler) {
        return true;
    }
    else return false;
}
public void win(int Spieler) {
    win = Spieler;
}
}
