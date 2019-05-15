import java.util.*;

public class Ki extends Player

{
    int difficulty;
    Random r;
    public Ki(GameBoard gameBoard,int difficulty)
    {
        super(gameBoard);
        this.difficulty = difficulty;
        r = new Random();
    }
    
    public void setzteStein()
    {
        super.setStone(2,r.nextInt(5),r.nextInt(5));
    }
    
    public void Turn() {
        super.turn(r.nextInt(3),r.nextInt(1));
    }
      
}
