import java.util.*;

public class Ki extends Player

{
    Random r;
    public Ki(GameBoard gameBoard)
    {
        super(gameBoard);
        r = new Random();
    }
    
    public void setStone()
    {
         super.setStone(2,r.nextInt(5),r.nextInt(5));
    }
    
    public void Turn() {
        super.turn(r.nextInt(3),r.nextInt(1));
    }
      
}
