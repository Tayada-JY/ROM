import java.io.*;
import java.util.*;
public class Wizard extends Novice
{
    public void setwizard(int newhp,int newexp,int newenergy)
    {
         super.setHP(newhp+100);
         super.setEXP(newexp);
         super.setENERGY(newenergy+200); 
         super.setName("WIZARD");
    }
}