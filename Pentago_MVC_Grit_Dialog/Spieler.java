import java.util.*;
public class Spieler
{
  private String name;
  private boolean ki;
  private Spielbrett sp;
    
  /**
   * Zwischen dem Spieler und dem Spielfeld wird eine kennt-Beziehung realisiert.
   */  
  public Spieler(Spielbrett spielfeld){
    sp = spielfeld;    
  }
  
  /**
   * Dem Spieler wird mit Hilfe eines Scanners ein Name zugewiesen.
   */
  public void spielerName() { 
     System.out.println("Was ist dein Name?");
     Scanner spielername = new Scanner(System.in);
     name  = spielername.nextLine(); 
  }
  
  /**
   * Der Name des Spielers wird zurückgegeben.
   */
  public String getName(){
       return name;
  }
  
  /**
   * Der Spieler kann eine Kugel setzen.
   */
  public void setzeStein(int SpielerNr,int x, int y) {     
     int i=0;    
    while (i<6) {    
         if (sp.getSpielfeld()[x][y] == 0) {
         sp.getSpielfeld()[x][y] = SpielerNr;
         i=6;
         }
         else {
         i++;
         }
     }
  }


  public void drehen(int panel, int richtung){
    int i = 0; 
    int j = 0;
    int[][] x = new int[6][6];
    for(int a=0; a<6; a++){
        for(int b=0; b<6; b++){
               x[a][b] = sp.getSpielfeld()[a][b];
        }
    }
    
    if (panel == 0) {i=0 ; j=0;} 
    if (panel== 1) {i=0 ; j=3;} 
    if (panel== 2) {i=3 ; j=0;} 
    if (panel == 3) {i=3 ; j=3;} 
  
    if(richtung == 0) { 
    sp.setSpielfeld(i,j,x[i][j+2]);
    
    sp.setSpielfeld(i+1,j,x[i][j+1]);
    sp.setSpielfeld(i+2,j,x[i][j]);
    sp.setSpielfeld(i,j+1,x[i+1][j+2]);
    sp.setSpielfeld(i+2,j+1,x[i+1][j]);
    sp.setSpielfeld(i,j+2,x[i+2][j+2]);
    sp.setSpielfeld(i+1,j+2,x[i+2][j+1]);
    sp.setSpielfeld(i+2,j+2,x[i+2][j]);
    }
   
    if (richtung == 1) {
    sp.setSpielfeld(i,j,x[i+2][j]);
    sp.setSpielfeld(i+1,j,x[i+2][j+1]);
    sp.setSpielfeld(i+2,j,x[i+2][j+2]);
    sp.setSpielfeld(i,j+1,x[i+1][j]);
    sp.setSpielfeld(i+2,j+1,x[i+1][j+2]);
    sp.setSpielfeld(i,j+2,x[i][j]);
    sp.setSpielfeld(i+1,j+2,x[i][j+1]);
    sp.setSpielfeld(i+2,j+2,x[i][j+2]);    
    }
}
}
