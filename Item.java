import java.io.*;
import java.util.*;
public class Item
{   
    private String name= new String();
    private int property;
    public void setname(String newname)
    {
        name=newname;
    }
    public void setproperty(int newproperty)
    {
        property=newproperty;
    }
    public String getname()
    {
        return name;
    }
    public int getproperty()
    {
        return property;
    }
}
