import java.io.*;
import java.util.*;
public class Marozka extends Monster{
    public Marozka(){
        super.setName("Marozka");
        super.setDamage(-1000);
        super.setUpexp(+100);
    }
    public int amountmons = 3;
    public void decrease(){
    --amountmons;
    }
    public int Amountmons(){
    return amountmons;
    }
}