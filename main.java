import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class main
{
public static void main(String args[])
{   
   
    Novice novice = new Novice(); 
    Wizard wz = new Wizard();
    Knight kn = new Knight();
    Scanner sc = new Scanner(System.in);
    Bag bag = new Bag();
    Random random = new Random();
    System.out.println("Enter 1 to Acttact");
    System.out.println("Enter 2 to Eatting");
    System.out.println("Enter 3 to Dead");
    System.out.println("Enter 'hppotion' to use +20HP");
    System.out.println("Enter 'egpotion' to use +20ENERGY");
    System.out.println("- - - - - - - - - - - - - - - - ");
    System.out.println("Your HP:"+ novice.getHp());
    System.out.println("Your EXP:"+ novice.getExp()); 
    System.out.println("Your ENERGY:"+ novice.getEnergy());
    System.out.println("BAG : HPPotion = "+bag.Numberhppotion());
    System.out.println("    : ENERGYPotion = "+bag.Numberenergypotion());
    System.out.println("- - - - - - - - - - - - - - - - ");
     while(novice.getHp() > 0 && novice.getEnergy() > 0 && wz.getHp()>0 &&wz.getEnergy()>0 &&kn.getHp()>0 &&kn.getEnergy()>0)
    {
        if(novice.getExp()<200){
            String data = sc.nextLine();
                if(data.equals("1") == true) {
                    System.out.println("...Acttact...");
                    System.out.println("-50HP +50EXP -5ENERGY");
                   novice.Powerattact();  
                   int num = random.nextInt(2);
                   if(num==0)
                   {
                       bag.increaseHPPotion();
                   }
                   else
                   {
                       bag.increaseENERGYPotion();
                   }
                }
                else if(data.equals("2") == true) 
                {
                    System.out.println("...Eatting...");
                    System.out.println("+10ENERGY");
                    novice.Powerup();
                }
                else if(data.equals("3") == true) 
                {
                    System.out.println("YOUR DEAD");
                    novice.Dead();
                }
                else if(data.equals("hppotion") == true && bag.Numberhppotion()!=0)
                {
                    System.out.println("USED HPPOTION ...");
                    System.out.println("");
                    novice.usingHPPotion();
                    bag.decreaseHPPotion();
                }
                 else if(data.equals("hppotion") == true && bag.Numberhppotion()==0)
                {
                    System.out.println("NO MORE HPPOTION");
                    System.out.println("");
                }
                else if(data.equals("egpotion") == true && bag.Numberenergypotion()!=0)
                {
                    System.out.println("USED ENERGYPOTION ...");
                    System.out.println("");
                    novice.usingENERGYPotion();
                    bag.decreaseENERGYPotion();
                }
                 else if(data.equals("egpotion") == true && bag.Numberenergypotion()==0)
                {
                    System.out.println("NO MORE ENERGYPOTION");
                    System.out.println("");
                }
            System.out.println("Your HP:"+ novice.getHp());
            System.out.println("Your EXP:"+ novice.getExp());
            System.out.println("Your ENERGY:"+ novice.getEnergy());
            System.out.println("BAG : HPPotion = "+bag.Numberhppotion());
            System.out.println("    : ENERGYPotion = "+bag.Numberenergypotion());
            System.out.println("- - - - - - - - - - - - - - - - ");
        }
        else{
            if(novice.getExp()==200)
            {
                System.out.println("should your career 'wizard'or'knight'");
                String career = sc.nextLine();
                   if(career.equals("wizard") == true)
                   {   wz.setwizard(novice.getHp(),novice.getExp(),novice.getEnergy());
                       System.out.println("Your career is wizard!!!");
                       System.out.println("Your HP:"+ wz.getHp());
                       System.out.println("Your EXP:"+ wz.getExp());
                       System.out.println("Your ENERGY:"+ wz.getEnergy());
                       System.out.println("BAG : HPPotion = "+bag.Numberhppotion());
                       System.out.println("    : ENERGYPotion = "+bag.Numberenergypotion());
                       System.out.println("- - - - - - - - - - - - - - - - ");
                           while(wz.getHp() > 0 && wz.getEnergy() > 0)
                           {
                               String mode = sc.nextLine();
                                if(mode.equals("1") == true) {
                                    System.out.println("...Acttact...");
                                    System.out.println("-50HP +50EXP -5ENERGY");
                                    wz.Powerattact();  
                                    int num = random.nextInt(2);
                                    if(num==0)
                                    {
                                       bag.increaseHPPotion();
                                    }
                                    else
                                    {
                                       bag.increaseENERGYPotion();
                                    }
                                }
                                else if(mode.equals("2") == true) 
                                {   
                                    System.out.println("...Eatting...");
                                    System.out.println("+10ENERGY");
                                    wz.Powerup();
                                }
                                else if(mode.equals("3") == true) 
                                {
                                    System.out.println("YOUR DEAD");
                                    wz.Dead();
                                }
                                else if(mode.equals("hppotion") == true && bag.Numberhppotion()!=0)
                                {
                                    System.out.println("USED HPPOTION ...");
                                    System.out.println("");
                                    wz.usingHPPotion();
                                    bag.decreaseHPPotion();
                                }
                                else if(mode.equals("hppotion") == true && bag.Numberhppotion()==0)
                                {
                                    System.out.println("NO MORE HPPOTION");
                                    System.out.println("");
                                }
                                else if(mode.equals("egpotion") == true && bag.Numberenergypotion()!=0)
                                {
                                    System.out.println("USED ENERGYPOTION ...");
                                    System.out.println("");
                                    wz.usingENERGYPotion();
                                    bag.decreaseENERGYPotion();
                                }
                                else if(mode.equals("egpotion") == true && bag.Numberenergypotion()==0)
                                {
                                    System.out.println("NO MORE ENERGYPOTION");
                                    System.out.println("");
                                }
                System.out.println("Your career is wizard!!!");                
                System.out.println("Your HP:"+ wz.getHp());
                System.out.println("Your EXP:"+ wz.getExp());
                System.out.println("Your ENERGY:"+ wz.getEnergy());
                System.out.println("BAG : HPPotion = "+bag.Numberhppotion());
                System.out.println("    : ENERGYPotion = "+bag.Numberenergypotion());
                System.out.println("- - - - - - - - - - - - - - - - ");
                            }
                    }
                    else if(career.equals("knight") == true)
                    {
                       System.out.println("Your career is knight!!!");
                       kn.setknight(novice.getHp(),novice.getExp(),novice.getEnergy());
                       System.out.println("Your HP:"+ kn.getHp());
                       System.out.println("Your EXP:"+ kn.getExp());
                       System.out.println("Your ENERGY:"+ kn.getEnergy());
                       System.out.println("BAG : HPPotion = "+bag.Numberhppotion());
                       System.out.println("    : ENERGYPotion = "+bag.Numberenergypotion());  
                       System.out.println("- - - - - - - - - - - - - - - - ");  
                       while(kn.getHp() > 0 && kn.getEnergy() > 0)
                           {
                               String mode = sc.nextLine();
                                if(mode.equals("1") == true) {
                                    System.out.println("...Acttact...");
                                    System.out.println("-50HP +50EXP -5ENERGY");
                                    kn.Powerattact();  
                                    int num = random.nextInt(2);
                                    if(num==0)
                                    {
                                       bag.increaseHPPotion();
                                    }
                                    else
                                    {
                                       bag.increaseENERGYPotion();
                                    }
                                 }
                                else if(mode.equals("2") == true) 
                                {
                                    System.out.println("...Eatting...");
                                    System.out.println("+10ENERGY");
                                    kn.Powerup();
                                }
                                else if(mode.equals("3") == true) 
                                {
                                    System.out.println("YOUR DEAD");
                                    kn.Dead();
                                }
                                else if(mode.equals("hppotion") == true && bag.Numberhppotion()!=0)
                                {
                                    System.out.println("USED HPPOTION ...");
                                    System.out.println("");
                                    kn.usingHPPotion();
                                    bag.decreaseHPPotion();
                                }
                                else if(mode.equals("hppotion") == true && bag.Numberhppotion()==0)
                                {
                                    System.out.println("NO MORE HPPOTION");
                                    System.out.println("");
                                }
                                else if(mode.equals("egpotion") == true && bag.Numberenergypotion()!=0)
                                {
                                    System.out.println("USED ENERGYPOTION ...");
                                    System.out.println("");
                                    kn.usingENERGYPotion();
                                    bag.decreaseENERGYPotion();
                                }
                                else if(mode.equals("egpotion") == true && bag.Numberenergypotion()==0)
                                {
                                    System.out.println("NO MORE ENERGYPOTION");
                                    System.out.println("");
                                }
                System.out.println("Your career is knight!!!");
                System.out.println("Your HP:"+ kn.getHp());
                System.out.println("Your EXP:"+ kn.getExp());
                System.out.println("Your ENERGY:"+ kn.getEnergy());
                System.out.println("BAG : HPPotion = "+bag.Numberhppotion());
                System.out.println("    : ENERGYPotion = "+bag.Numberenergypotion());
                System.out.println("- - - - - - - - - - - - - - - - ");
                    }
            }
            }
    } 
    }
    System.out.println("End Game");
}
}
