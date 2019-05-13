import java.util.*;

public class Ki extends Spieler

{
    int schwierigkeit;
    Random r;
    public Ki(Spielbrett spielfeld,int schwierigkeit)
    {
        super(spielfeld);
        this.schwierigkeit = schwierigkeit;
        r = new Random();
    }
    
    public void setzteStein()
    {
        super.setzeStein(2,r.nextInt(5),r.nextInt(5));
    }
    
    public void Turn() {
        super.Turn(r.nextInt(3),r.nextInt(1));
    }
      
}
