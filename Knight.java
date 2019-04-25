import java.io.*;
import java.util.*;
public class Knight extends Novice
{
    public  void setknight(int newhp,int newexp,int newenergy)
    {
        super.setHP(newhp+200);
        super.setEXP(newexp);
        super.setENERGY(newenergy+100); 
        super.setName("KNIGHT");
    }

}