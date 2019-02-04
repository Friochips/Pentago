import java.util.*;
public class Spieler
{
    
    private String name;
    private boolean ki;
    private Spielbrett sp;
    
    public Spieler(Spielbrett spielfeld){
    sp = spielfeld;    
    }
    
   public void spielerName() { 
     System.out.println("Was ist dein Name?");
     Scanner spielername = new Scanner(System.in);
     name  = spielername.nextLine(); 
   }
   
   public String getName(){
       return name;
    }
    
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
    System.out.println(name +": Feld(0-3):");        //Abfrage welches Feld gedreht werden soll
    Scanner eingabewert = new Scanner(System.in);
    eingabe = eingabewert.nextInt(); 
    
    if (eingabe == 0) {i=0 ; j=0;} 
    if (eingabe == 1) {i=0 ; j=3;} 
    if (eingabe == 2) {i=0 ; j=0;} 
    if (eingabe == 3) {i=3 ; j=3;} 
    
    System.out.println(name +": rechts oder links? (1/0):"); //Abfrage wie es gedreht werden soll
    Scanner eingabewert2 = new Scanner(System.in);
    eingabe2 = eingabewert2.nextInt();
    
    // wenn ich Lust hab mach ich das schöner
    // j = zeilen; i = spalten : Skizze hilft bei Verständnisschwierigkeiten
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
    sp.getSpielfeld()[i+2][j] = x[i+2][j+1];
    sp.getSpielfeld()[i][j+1] = x[i+1][j];
    sp.getSpielfeld()[i+2][j+1] = x[i+1][j+2];
    sp.getSpielfeld()[i][j+2] = x[i][j];
    sp.getSpielfeld()[i+1][j+2] = x[i][j+1];
    sp.getSpielfeld()[i+2][j+2] = x[i][j+2];    
    }
   }



}
