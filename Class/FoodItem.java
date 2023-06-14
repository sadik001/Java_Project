package Class;

import Interface.*;

public abstract class FoodItem implements Quantity
{
    protected String fid;
    protected String name;
    protected int availableQuantity;
    protected double price;
    
    public void setFid(String fid)
    {
        this.fid  = fid;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAvailableQuantity(int availableQuantity)
    {
        this.availableQuantity = availableQuantity;
    }
    public  void setPrice(double price)
    {
        this.price = price;
    }

    public String getFid()
    {
        return fid;
    }
    public String getName()
    {
        return name;
    }
    public int getAvailableQuantity()
    {
        return availableQuantity;
    }
    public double  getprice()
    {
        return price;
    }
    public abstract void showInfo();

    public boolean addQuantity(int amount)
    {
        if (0<amount)
        {
            availableQuantity = availableQuantity + amount;
            return true;
        }
        return false;
    }
    
    public boolean sellQuantity (int amount)
    {
        if(0<amount && amount <= availableQuantity)
        {
            availableQuantity = availableQuantity - amount;
            return true;
        }
        return false;
    }

} 
