package Class;

//import java.lang.*;
import Interface.*;

public class FoodCourt implements EmployeeOperation, RestaurantOperations
{
    private Employee employees[] = new Employee[350];
    private Restaurant restaurant[] = new Restaurant[160];

    public boolean insertRestaurant(Restaurant r)
    {
        for(int i=0; i<restaurant.length;i++)
        if (restaurant [i] == null)
        {
            restaurant[i] = r;
            return true;
        }
        return false;
    }
    public boolean removeRestaurant(Restaurant r)
    {
        if (r==null) 
        return false;
        for(int i=0;i<restaurant.length;i++)
        {
            if(restaurant[i]== r)
            {
                restaurant [i]= null;
                return true;
            }
        }
        return false;    
    }

    public Restaurant searchRestaurant(String res)
    {
        for (int i = 0; i<restaurant.length; i++)
        {
        if(restaurant[i]!= null && restaurant[i].getRes().equals(res))
        return restaurant [i];
        }
        return null;
    }

    public void showAllRestaurant()
    {
        boolean empty = false;
        for(int i = 0;i<restaurant.length;i++)
        if(restaurant[i] != null)
        {
            empty = true;
            break;
        }
        if(empty == false)
        {System.out.println("Restaurent List Empty");}
        for(int i=0; i<restaurant.length;i++)
        if(restaurant [i] != null)
        {
            System.out.println("RESTAURANT NAME : "+restaurant[i].getName());
            System.out.println("RESTAURANT  ID  : "+restaurant[i].getRes());
            System.out.println();
        }
    }

    public boolean insertEmployee(Employee e)
    {
        for(int i = 0;i<employees.length;i++)
        if(employees[i] == null)
        {
            employees [i]= e;
            return true;
        }
        return false;
    }

    public boolean removeEmployee(Employee e)
    {
        if(e == null)
        return false;
      for(int i=0; i<employees.length;i++)
      {
        if(employees [i]== e)
        {
            employees [i] = null;
            return true;
        }
      }
        return false;
    }

    public Employee searchEmployee(String empId)
    {
        for(int i=0;i<employees.length;i++)
        {
        if (employees [i] != null && employees[i].getEmpId().equals(empId))
        return employees[i];
        }
        return null;
    }
    public void showAllEmployee()
    {
        boolean empty = false;
        for(int i=0;i<employees.length;i++)
        if(employees[i] != null)
        {
            empty = true;
            break;
        }
        if(empty == false)
        {
            System.out.println("Employee List Empty");
        }
    
        for(int i=0;i<employees.length;i++)
        if(employees [i] != null)
        {
            System.out.println("Employee    Name   : "+employees[i].getName());
            System.out.println("Employee    ID     : "+employees[i].getEmpId());
            System.out.println("Employee    Salary : "+employees[i].getSalary());
            System.out.println();
        }
    }
}
