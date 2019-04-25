import java.io.*;
import java.util.*;
public class ENERGYpotion extends Item
{
    public ENERGYpotion()
    {
          super.setname("ENERGYpotion");
          super.setproperty(20);
    }
    public void Showitem()
    {
        System.out.println("Potion name "+super.getname()+"+ENERGY"+super.getproperty());
    }
}