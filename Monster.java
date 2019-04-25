import java.io.*;
import java.util.*;
public class Monster{
    private String name;
    private int damage;
    private int upexp;
   // private int amountmons;

    public String getName(){
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public int getUpexp(){
        return upexp;
    }
    /*public int getAmounmons(){
        return amountmons;
    }*/
    public void setName(String NAME){
        this.name = NAME;
    }
    public void setDamage(int DAMAGE){
        this.damage=DAMAGE;
    }
    public void setUpexp(int UPEXP){
        this.upexp=UPEXP;
    }
    /*public void setAmounnons(int AMOUNTMONS){
        this.amountmons=AMOUNTMONS;
    }*/
}