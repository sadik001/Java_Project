package Class;

public class MainDish extends FoodItem
{
    private String category;
    
    public  MainDish(String name,String fid,int availableQuantity,double price,String category)
    {
        this.name = name;
        this.fid = fid;
        this.availableQuantity = availableQuantity;
        this.price = price;
        this.category = category;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public String getCategory()
    {
        return category;
    }

    public void showInfo()
    {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Food       Name         :  "+name);
        System.out.println("Food      ID            :  "+fid);
        System.out.println("Food Available Quantity :  "+availableQuantity);
        System.out.println("Food    Iteams   Price  :  "+price);
        System.out.println("Food      Category      :  "+category);
    }
}