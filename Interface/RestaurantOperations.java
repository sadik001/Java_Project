package Interface;

import Class.*;

public interface RestaurantOperations
{
    boolean insertRestaurant(Restaurant r);

    boolean removeRestaurant(Restaurant r);

    Restaurant searchRestaurant(String res);

    public void showAllRestaurant();
}