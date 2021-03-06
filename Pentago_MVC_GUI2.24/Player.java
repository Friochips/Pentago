import java.util.*;
public class Player
{
    boolean ki = false;
    private GameBoard sp;
    private Random r;
    
  /**
   * Zwischen dem Spieler und dem Spielfeld wird eine kennt-Beziehung realisiert.
   */  
  public Player(GameBoard gameBoard){
    sp = gameBoard;    
  }
  
  
    
  /**
   * Der Spieler kann eine Kugel setzen.
   */
  public void setStone(int playerNr,int x, int y) {     
    int i=0;    
    while (i<6) {    
         if (sp.getGameBoard()[x][y] == 0) {
         sp.getGameBoard()[x][y] = playerNr;
         i=6;
         }
         else {
         i++;
         }
     }
  }
  public void kizug() {
      r = new Random();
      setStone(2,r.nextInt(5),r.nextInt(5));
      turn(r.nextInt(3),r.nextInt(1));
  }


  public void turn(int panel, int direction){
    int i = 0; 
    int j = 0;
    int[][] x = new int[6][6];
    for(int a=0; a<6; a++){
        for(int b=0; b<6; b++){
               x[a][b] = sp.getGameBoard()[a][b];
        }
    }
    
    if (panel == 0) {i=0 ; j=0;} 
    if (panel== 1) {i=0 ; j=3;} 
    if (panel== 2) {i=3 ; j=0;} 
    if (panel == 3) {i=3 ; j=3;} 
  
    if(direction == 0) { 
    sp.setGameBoard(i,j,x[i][j+2]);
    
    sp.setGameBoard(i+1,j,x[i][j+1]);
    sp.setGameBoard(i+2,j,x[i][j]);
    sp.setGameBoard(i,j+1,x[i+1][j+2]);
    sp.setGameBoard(i+2,j+1,x[i+1][j]);
    sp.setGameBoard(i,j+2,x[i+2][j+2]);
    sp.setGameBoard(i+1,j+2,x[i+2][j+1]);
    sp.setGameBoard(i+2,j+2,x[i+2][j]);
    }
   
    if (direction == 1) {
    sp.setGameBoard(i,j,x[i+2][j]);
    sp.setGameBoard(i+1,j,x[i+2][j+1]);
    sp.setGameBoard(i+2,j,x[i+2][j+2]);
    sp.setGameBoard(i,j+1,x[i+1][j]);
    sp.setGameBoard(i+2,j+1,x[i+1][j+2]);
    sp.setGameBoard(i,j+2,x[i][j]);
    sp.setGameBoard(i+1,j+2,x[i][j+1]);
    sp.setGameBoard(i+2,j+2,x[i][j+2]);    
    }
    }
}
