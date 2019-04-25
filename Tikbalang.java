import java.io.*;
import java.util.*;
public class Tikbalang extends Monster{
    public Tikbalang(){
        super.setName("Tikbalang");
        super.setDamage(-500);
        super.setUpexp(+50);
    }
    public int amountmons = 5;
    public void decrease(){
    --amountmons;
    }
    public int Amountmons(){
    return amountmons;
    }
}