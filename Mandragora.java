import java.io.*;
import java.util.*;
public class Mandragora extends Monster{
public Mandragora(){
    super.setName("Mandragora");
    super.setDamage(-20);
    super.setUpexp(+5);
}
public int amountmons = 15;
public void decrease(){
    --amountmons;
}
public int Amountmons(){
    return amountmons;
}
}