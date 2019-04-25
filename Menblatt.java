import java.io.*;
import java.util.*;
public class Menblatt extends Monster{
    public Menblatt(){
        super.setName("Menblatt");
        super.setDamage(-100);
        super.setUpexp(+15);
    }
    public int amountmons = 10;
    public void decrease(){
    --amountmons;
    }
    public int Amountmons(){
    return amountmons;
    }
}