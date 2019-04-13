import java.util.*;

public class Spielbrett
{
/**
 * Das Spielfeld wird deklariert und initalisiert.
 */
private int[][] spielfeld = new int[6][6];

/**
 * Das Spielfeld wird mit Nullen befüllt.
 */
public Spielbrett(){
    for(int i=0; i<6; i++){
        for(int j=0; j<6; j++){
               spielfeld[i][j] = 0;
        }
    }
}    
 public void setSpielfeld(int a, int b, int c){
    spielfeld[a][b] = c;
} 
/**
 * Das Spielfeld wird zurückgegeben.
 */
public int[][] getSpielfeld(){
    return spielfeld;
}

}