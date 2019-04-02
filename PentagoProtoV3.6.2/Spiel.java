import java.util.*;
public class Spiel
{
/**
 * Mit der Erzeugung der Klasse Spiel wird das spielfeld und zwei spieler erzeugt.
 */
Spielbrett spielfeld = new Spielbrett();
Spieler spieler1 = new Spieler(spielfeld);
Spieler spieler2 = new Spieler(spielfeld);
int zug = 1;
int eingabe;
Spieler gewinner;

/**
 * Hier wird überprüft ob ein spieler gewonnen hat.
 */
public boolean gewonnen() {
    for (int i=0;i<6;i++) {
        for (int j=0; j<6;j++) {
            if (horizontal(i,j) == true || vertikal(i,j) == true || schrägLinksOben(i,j) == true || schrägRechtsOben(i,j) == true) {
                System.out.println("Spieler " +gewinner.getSpielerName()+ " hat gewonnen");    
                return true;
                    
            }
        }
    }
    return false;
}

private void gewinnerZuweisung(int y){
    if(y!=0){
            if(y==1){
            gewinner = spieler1;
        }
            else{
            gewinner = spieler2;
        }
    }
}

private boolean reihePruefung(int[] a){
    if (a[0]== a[1] && a[0] == a[2] && a[0] == a[3] && a[0] == a[4]){
            if(a[0] != 0){
                gewinnerZuweisung(a[0]);
                if(gewinner == spieler1 || gewinner == spieler2){
                    return true;
                }
                else{
                 return false;   
                }
            }
            else{
                return false;
            }
    }
    else{
        if(a[1]==a[2] && a[1]==a[3] && a[1]==a[4] && a[1]==a[5]){
            if(a[1] != 0){
                gewinnerZuweisung(a[1]);
                if(gewinner == spieler1 || gewinner == spieler2){
                    return true;
                }
                else{
                    return false;
                }
            }

            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}

/**
 * Hier wird überprüft ob ein spieler eine Reihe mit Kugeln in der Horizontalen erspielt hat, also gewonnen hat.
 */
public boolean horizontal(int i,int j) {
    if (j>3) {
        j = j - 3;
    }
    int[] a = new int[6];
    for(int k=0; k<6; k++){
        a[k] = spielfeld.getSpielfeld()[i][j+k];
    }
    return reihePruefung(a);
}

/**
 * Hier wird überprüft ob ein spieler eine Reihe mit Kugeln in der Vertikalen erspielt hat, also gewonnen hat.
 */
public boolean vertikal(int i, int j) {
    if (i>3) {
        i = i - 3;
    }
    int[] a = new int[6];
    for(int k=0; k<6; k++){
        a[k] = spielfeld.getSpielfeld()[i+k][j];
    }
    return reihePruefung(a);
}


/**
 * Hier wird überprüft ob ein spieler eine Reihe mit Kugeln von oben links nach unten rechts erspielt hat, also gewonnen hat.
 */
public boolean schrägLinksOben(int i, int j) {
    if (j<3 || i>3) {
        return false;
    }
       int[] a = new int[6];
    for(int k=0; k<6; k++){
        a[k] = spielfeld.getSpielfeld()[i+k][j-k];
    }
    return reihePruefung(a);
}

/**
 * Hier wird überprüft ob ein spieler eine Reihe mit Kugeln von oben rechts nach unten links erspielt hat, also gewonnen hat.
 */
public boolean schrägRechtsOben(int i, int j) {
    if (j>3 || i>3) {
        return false;
    }
    int[] a = new int[6];
    for(int k=0; k<6; k++){
        a[k] = spielfeld.getSpielfeld()[i+k][j+k];
    }
    return reihePruefung(a);
}
}
