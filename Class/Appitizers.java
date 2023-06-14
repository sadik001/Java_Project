package Class;

public class Appitizers extends FoodItem
{
    private String size;

    public Appitizers(String Name,String Fid,int AvailableQuantity,double Price,String Size)
    {
        this.name =Name;
        this.fid = Fid;
        this.availableQuantity= AvailableQuantity;
        this.price = Price;
        this.size=Size;
    }
    public void setSize(String size)
    {
        this.size = size;
    }
    public String getSize()
    {
        return size;
    }

    public void showInfo()
    {
        System.out.println("------------------------------------------------");
        System.out.println("Food     Name           : "+name);
        System.out.println("Food      ID            : "+fid);
        System.out.println("Food Available Quantity : "+availableQuantity);
        System.out.println("Food         Price      : "+price);
        System.out.println("Food         Size       : "+size);
    }
}