import java.io.*;
import java.util.*;
public class Novice
{
    private int hp;
    private int exp;
    private int energy;
    private String name;
    private int kill;
    private int level;
Bag bg = new Bag();

public Novice()
{
  hp=500;
  exp=0;
  energy=100;
  name = "NOVICE";
  kill = 0;
  level = 1;
  
}

public void Powerattact()
{  
   hp = hp-50;
   exp = exp+50;
   energy = energy-5;
}
public void Powerup()
{   
    energy = energy+50;
    hp = hp+200;
}
public void Dead()
{
    hp = 0;
    exp = 0;
    energy = 0;
}
public void usingHPPotion()
{
        hp=hp+bg.useHPPotion();
}
public void usingENERGYPotion()
{
        energy=energy+bg.useENERGYPotion();
}
public void losehp(int HP){
    hp += HP;
}
public void upexp(int EXP){
    exp+=EXP;
}
public void loseenergy(){
    energy-=5;
}
public void kill(){
    kill += 1;
}
public  void levelup(){
    level+=1;
}
public int getHp()
{
    return hp;
}
public int getExp()
{
    return exp;
}
public int getEnergy()
{
    return energy;
}
public String getName(){
    return name;
}
public int getKill(){
    return kill;
}
public int getLevel(){
    return level;
}
public void setHP(int HP)
{
    hp=HP;
}
public void setEXP(int EXP)
{
    exp=EXP;
}
public void setENERGY(int ENERGY)
{
    energy=ENERGY;
}
public void setName(String NAME){
    this.name = NAME;
}
public void setKill(int KILL){
    kill=KILL;
}
public void setLevel(int LEVEL){
    level=LEVEL;
}

}