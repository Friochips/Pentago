import java.util.*;
public class Spiel
{
/**
 * Mit der Erzeugung der Klasse Spiel wird das Spielfeld und zwei Spieler erzeugt.
 */
Spielbrett Spielfeld = new Spielbrett();
Spieler Spieler1 = new Spieler(Spielfeld);
Spieler Spieler2 = new Spieler(Spielfeld);
int zug = 1;
int eingabe;

/**
 * In der Methode spielen machen beide Spieler solange abwechselnd einen Zug, also setzen einen Spielstein und drehen ein Panel,
 * bis einer von beiden gewonnen hat.
 */
public void spielen() {
    // Beginn des Spiels
    Spielfeld.ausgabeSpielfeld();  
    System.out.println("Spieler 1:");
    Spieler1.spielerName();
    System.out.println("Spieler 2:");
    Spieler2.spielerName();
    while (gewonnen((zug % 2)) == false ) {       
    // zug von spieler 1
    zug++; 
    if(zug != 2) {
    Spieler1.drehen((zug % 2));
    Spielfeld.ausgabeSpielfeld();  
    }
    Spieler1.setzeStein((zug % 2)+1);
    Spielfeld.ausgabeSpielfeld();  
    // zug von Spieler 2
    zug++;
    if(zug != 2) {
    Spieler2.drehen((zug % 2));
    Spielfeld.ausgabeSpielfeld();  
    }
    Spieler2.setzeStein((zug % 2)+1);
    Spielfeld.ausgabeSpielfeld();          
    }
}

/**
 * Hier wird überprüft ob ein Spieler gewonnen hat.
 */
public boolean gewonnen(int Spieler) {
    for (int i=0;i<6;i++) {
        for (int j=0; j<6;j++) {
            if (horizontal(Spieler,i,j) || vertikal(Spieler,i,j) || schrägLinksOben(Spieler,i,j) || schrägRechtsOben(Spieler,i,j)) {
                System.out.println("Spieler " +Spieler+ " hat gewonnen");    
                return true;
                    
            }
        }
    }
    return false;
}

/**
 * Hier wird überprüft ob ein Spieler eine Reihe mit Kugeln in der Horizontalen erspielt hat, also gewonnen hat.
 */
public boolean horizontal(int Spieler,int i,int j) {
    if (j>3) {
    j = j - 3;
    }
    if (Spielfeld.getSpielfeld()[i][j]==Spieler && Spielfeld.getSpielfeld()[i][j+1]==Spieler && Spielfeld.getSpielfeld()[i][j+2]==Spieler && Spielfeld.getSpielfeld()[i][j+3]==Spieler && Spielfeld.getSpielfeld()[i][j+4]==Spieler) {
        return true;
    }
    else return false;
}

/**
 * Hier wird überprüft ob ein Spieler eine Reihe mit Kugeln in der Vertikalen erspielt hat, also gewonnen hat.
 */
public boolean vertikal(int Spieler,int i, int j) {
        if (i>3) {
    i = i - 3;
    }
    if (Spielfeld.getSpielfeld()[i][j]==Spieler && Spielfeld.getSpielfeld()[i+1][j]==Spieler && Spielfeld.getSpielfeld()[i+2][j]==Spieler && Spielfeld.getSpielfeld()[i+3][j]==Spieler && Spielfeld.getSpielfeld()[i+4][j]==Spieler) {
        return true;
    }
    else return false;
}

/**
 * Hier wird überprüft ob ein Spieler eine Reihe mit Kugeln von oben links nach unten rechts erspielt hat, also gewonnen hat.
 */
public boolean schrägLinksOben(int Spieler, int i, int j) {
    if (j<3 || i>3) {
        return false;
    }
    if (Spielfeld.getSpielfeld()[i][j]==Spieler && Spielfeld.getSpielfeld()[i+1][j-1]==Spieler && Spielfeld.getSpielfeld()[i+2][j-2]==Spieler && Spielfeld.getSpielfeld()[i+3][j-2]==Spieler && Spielfeld.getSpielfeld()[i+4][j-3]==Spieler) {
        return true;
    }
    else return false;
}

/**
 * Hier wird überprüft ob ein Spieler eine Reihe mit Kugeln von oben rechts nach unten links erspielt hat, also gewonnen hat.
 */
public boolean schrägRechtsOben(int Spieler, int i, int j) {
    if (j>3 || i>3) {
        return false;
    }
    if (Spielfeld.getSpielfeld()[i][j]==Spieler && Spielfeld.getSpielfeld()[i+1][j+1]==Spieler && Spielfeld.getSpielfeld()[i+2][j+2]==Spieler && Spielfeld.getSpielfeld()[i+3][j+3]==Spieler && Spielfeld.getSpielfeld()[i+4][j+4]==Spieler) {
        return true;
    }
    else return false;
}
}
