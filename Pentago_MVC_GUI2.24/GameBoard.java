import java.util.*;

public class GameBoard
{
/**
 * Das Spielfeld wird deklariert und initalisiert.
 */
private int[][] gameBoard = new int[6][6];

/**
 * Das Spielfeld wird mit Nullen befüllt.
 */
public GameBoard(){
    for(int i=0; i<6; i++){
        for(int j=0; j<6; j++){
               gameBoard[i][j] = 0;
        }
    }
}  
  
 public void setGameBoard(int a, int b, int c){
    gameBoard[a][b] = c;
} 

/**
 * Das Spielfeld wird zurückgegeben.
 */
public int[][] getGameBoard(){
    return gameBoard;
}
}