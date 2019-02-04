import java.util.*;

public class Spielbrett
{
private int[][] spielfeld = new int[6][6];


public Spielbrett(){
    for(int i=0; i<6; i++){
        for(int j=0; j<6; j++){
               spielfeld[i][j] = 0;
        }
    }
}    

public int[][] getSpielfeld(){
    return spielfeld;
}
  
public void ausgabeSpielfeld() {

System.out.print("    0    1    2    3    4    5\n");          
    
    for(int x=0; x < 6; x++) {
        System.out.print (x+" ");
        for(int y=0; y < 6; y++) { 
                System.out.print("| " + spielfeld[x][y] + " |");  
        }
        System.out.println("\n");  
}
}
}