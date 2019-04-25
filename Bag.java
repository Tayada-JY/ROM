import java.io.*;
import java.util.*;
public class Bag
{
    public int numberhppotion = 0;
    public int numberenergypotion = 0;
    Item its = new Item();
    HPpotion hppotion = new HPpotion();
    ENERGYpotion energypotion = new ENERGYpotion();
    public int useHPPotion(){
        return hppotion.getproperty();
    }
    public int useENERGYPotion(){
        return energypotion.getproperty();
    }
    public void decreaseHPPotion(){
        --numberhppotion;
    }
    public void increaseHPPotion(){
        ++numberhppotion;
    }
    public void decreaseENERGYPotion(){
        --numberenergypotion;
    }
    public void increaseENERGYPotion(){
        ++numberenergypotion;
    }

    public int Numberhppotion(){
        return numberhppotion;
    }
    public int Numberenergypotion(){
        return numberenergypotion;
    }
}