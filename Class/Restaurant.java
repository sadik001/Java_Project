package Class;

//import java.lang.*;
import Interface.*; 

public class Restaurant implements FoodItemOperation
{
    private String res;
    private String name;
    private FoodItem fooditems[] = new FoodItem[120];

    public void setName(String name)
    {
        this.name = name;   
    }
    public String getName()
    {
        return name;
    }
    public void setRes(String res)
    {
        this.res = res;
    }
    public String getRes()
    {
        return res;
    }

    public boolean insertFoodItem(FoodItem ftm)
    {
        for(int i = 0; i<fooditems.length; i++)
        if(fooditems[i] == null)
        {
            fooditems[i] = ftm;
            return true;
        }
        return false;
    }

    public boolean removeFoodItem(FoodItem ftm)
    {
        if(ftm == null)
        {
            return false;
        }
        for(int i = 0; i< fooditems.length; i++)
        {
            if(fooditems[i] == ftm)
            {
                fooditems[i] = null;
                return true;
            }
        }
        return false;
    }

    public FoodItem searchFoodItem(String food)
    {
        for(int i = 0; i<fooditems.length; i++)
            {
                if(fooditems[i] !=null && fooditems[i].getFid().equals(food));
                {
                    return fooditems[i];
                }
                
            }
        return null;
    }

    public void showAllFoodItems()
    {
        boolean empty = false;
        for(int i=0 ; i< fooditems.length;i++)
        {
            if(fooditems[i]  != null )
            {
                empty = true;
                break;
            }
        }
        if (empty == false) {
            System.out.println("Food Item List Empty");
            return;
        }
        for(int i = 0;i<fooditems.length;i++)
        {
            if(fooditems[i] != null)
            {
                fooditems[i].showInfo();
            } 
        }
    }
}
