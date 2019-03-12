import java.util.*;
public class Spiel
{
Spielbrett Spielfeld = new Spielbrett();
Spieler Spieler1 = new Spieler(Spielfeld);
Spieler Spieler2 = new Spieler(Spielfeld);
int zug = 1;
int eingabe;
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

public boolean horizontal(int Spieler,int i,int j) {
    if (j>3) {
    j = j - 3;
    }
    if (Spielfeld.getSpielfeld()[i][j]==Spieler && Spielfeld.getSpielfeld()[i][j+1]==Spieler && Spielfeld.getSpielfeld()[i][j+2]==Spieler && Spielfeld.getSpielfeld()[i][j+3]==Spieler && Spielfeld.getSpielfeld()[i][j+4]==Spieler) {
        return true;
    }
    else return false;
}

public boolean vertikal(int Spieler,int i, int j) {
        if (i>3) {
    i = i - 3;
    }
    if (Spielfeld.getSpielfeld()[i][j]==Spieler && Spielfeld.getSpielfeld()[i+1][j]==Spieler && Spielfeld.getSpielfeld()[i+2][j]==Spieler && Spielfeld.getSpielfeld()[i+3][j]==Spieler && Spielfeld.getSpielfeld()[i+4][j]==Spieler) {
        return true;
    }
    else return false;
}

public boolean schrägLinksOben(int Spieler, int i, int j) {
    if (j<3 || i>3) {
        return false;
    }
    if (Spielfeld.getSpielfeld()[i][j]==Spieler && Spielfeld.getSpielfeld()[i+1][j-1]==Spieler && Spielfeld.getSpielfeld()[i+2][j-2]==Spieler && Spielfeld.getSpielfeld()[i+3][j-2]==Spieler && Spielfeld.getSpielfeld()[i+4][j-3]==Spieler) {
        return true;
    }
    else return false;
}

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
