import java.io.*;
import java.util.*;
public class HPpotion extends Item
{
    public HPpotion()
    {
          super.setname("HPpotion");
          super.setproperty(250);
    }
    public void Showitem()
    {
        System.out.println("Potion name "+super.getname()+"+HP"+super.getproperty());
    }
}