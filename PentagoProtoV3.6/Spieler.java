import java.util.*;
public class Spieler
{
  public String name;
  public int spielerNr;
  private boolean ki;
  private Spielbrett sp;
    
  /**
   * Zwischen dem Spieler und dem Spielfeld wird eine kennt-Beziehung realisiert.
   */  
  public Spieler(Spielbrett spielfeld){
    sp = spielfeld;    
  }
  
  public void setSpielerNr(int spielernummer){
      spielerNr = spielernummer;
    }
      
  public int getSpielerNr(){
      return spielerNr;
    }
    
  public void setSpielerName(String spielername){
      name = spielername;
    
  }

  /**
   * Der Name des Spielers wird zurückgegeben.
   */
  public String getSpielerName(){
       return name;
  }
  
  /*
  /**
   * Der Spieler kann mit Hilfe eines Scanners eine Kugel setzen.
   
  public void setzeStein(int SpielerNr) {     
     int i=0;
     int eingabe;
     int eingabe2;
     System.out.println(name +": In welche Zeile möchstest du deine Kugel setzen?");
     Scanner eingabewert = new Scanner(System.in);
     eingabe = eingabewert.nextInt();
     System.out.println(name +": In welche Spalte möchstest du deine Kugel setzen?");
     Scanner eingabewert2 = new Scanner(System.in);
     eingabe2 = eingabewert2.nextInt();   
    
    while (i<6) {    
         if (sp.getSpielfeld()[eingabe][eingabe2] == 0) {
         sp.getSpielfeld()[eingabe][eingabe2] = SpielerNr;
         i=6;
         }
         else {
         i++;
         }
     }
  }
  */
  public void fuck2(){
     
    }
    
  public void setzeStein(int zeile, int spalte){
      int i=0;
      //zeile = zeile++;
      //spalte = spalte++;
      while (i<6) {    
         if (sp.getSpielfeld()[zeile][spalte] == 0) {
         sp.getSpielfeld()[zeile][spalte] = spielerNr;
         i=6;
         }
         else {
         i++;
         }
     }
    }
  
   /*
  /**
   * Der Spieler kann mit Hilfe eines Scanners ein Panel drehen.
   *
   public void drehen(int SpielerNr) {    

    int i = 0; 
    int j = 0;
    int[][] x = new int[6][6];
    for(int a=0; a<6; a++){
        for(int b=0; b<6; b++){
               x[a][b] = sp.getSpielfeld()[a][b];
        }
    }
    int eingabe;
    int eingabe2;
    System.out.println(name +": wähle ein Feld zum drehen(0-3):");        //Abfrage welches Feld gedreht werden soll
    Scanner eingabewert = new Scanner(System.in);
    eingabe = eingabewert.nextInt(); 
    
    if (eingabe == 0) {i=0 ; j=0;} 
    if (eingabe == 1) {i=0 ; j=3;} 
    if (eingabe == 2) {i=3 ; j=0;} 
    if (eingabe == 3) {i=3 ; j=3;} 
    
    System.out.println(name +": Drehen nach rechts oder links? (1/0):"); //Abfrage in welche Richtung es gedreht werden soll
    Scanner eingabewert2 = new Scanner(System.in);
    eingabe2 = eingabewert2.nextInt();
    
    // j = zeilen; i = spalten 
    if(eingabe2 == 0) { 
    sp.getSpielfeld()[i][j] = x[i][j+2];
    sp.getSpielfeld()[i+1][j] = x[i][j+1];
    sp.getSpielfeld()[i+2][j] = x[i][j];
    sp.getSpielfeld()[i][j+1] = x[i+1][j+2];
    sp.getSpielfeld()[i+2][j+1] = x[i+1][j];
    sp.getSpielfeld()[i][j+2] = x[i+2][j+2];
    sp.getSpielfeld()[i+1][j+2] = x[i+2][j+1];
    sp.getSpielfeld()[i+2][j+2] = x[i+2][j];
    }
   
    if (eingabe2 == 1) {
    sp.getSpielfeld()[i][j] = x[i+2][j];
    sp.getSpielfeld()[i+1][j] = x[i+2][j+1];
    sp.getSpielfeld()[i+2][j] = x[i+2][j+2];
    sp.getSpielfeld()[i][j+1] = x[i+1][j];
    sp.getSpielfeld()[i+2][j+1] = x[i+1][j+2];
    sp.getSpielfeld()[i][j+2] = x[i][j];
    sp.getSpielfeld()[i+1][j+2] = x[i][j+1];
    sp.getSpielfeld()[i+2][j+2] = x[i][j+2];    
    }
  }
  */
 public void fuck(){
     
    }
    
  public void drehen(int feld, String drehrichtung){
    int i = 0; 
    int j = 0;
    int[][] x = new int[6][6];
    for(int a=0; a<6; a++){
        for(int b=0; b<6; b++){
               x[a][b] = sp.getSpielfeld()[a][b];
        }
    }
    
    if (feld == 0) {i=0 ; j=0;} 
    if (feld == 1) {i=0 ; j=3;} 
    if (feld == 2) {i=3 ; j=0;} 
    if (feld == 3) {i=3 ; j=3;} 
  
    if(drehrichtung == "links") { 
    sp.getSpielfeld()[i][j] = x[i][j+2];
    sp.getSpielfeld()[i+1][j] = x[i][j+1];
    sp.getSpielfeld()[i+2][j] = x[i][j];
    sp.getSpielfeld()[i][j+1] = x[i+1][j+2];
    sp.getSpielfeld()[i+2][j+1] = x[i+1][j];
    sp.getSpielfeld()[i][j+2] = x[i+2][j+2];
    sp.getSpielfeld()[i+1][j+2] = x[i+2][j+1];
    sp.getSpielfeld()[i+2][j+2] = x[i+2][j];
    }
   
    if (drehrichtung == "rechts") {
    sp.getSpielfeld()[i][j] = x[i+2][j];
    sp.getSpielfeld()[i+1][j] = x[i+2][j+1];
    sp.getSpielfeld()[i+2][j] = x[i+2][j+2];
    sp.getSpielfeld()[i][j+1] = x[i+1][j];
    sp.getSpielfeld()[i+2][j+1] = x[i+1][j+2];
    sp.getSpielfeld()[i][j+2] = x[i][j];
    sp.getSpielfeld()[i+1][j+2] = x[i][j+1];
    sp.getSpielfeld()[i+2][j+2] = x[i][j+2];    
    }
}
}
