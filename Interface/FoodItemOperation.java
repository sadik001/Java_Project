package Interface;

import Class.*;

public interface FoodItemOperation
{
    boolean insertFoodItem(FoodItem ftm);
    boolean removeFoodItem(FoodItem ftm);

    FoodItem searchFoodItem(String food);

    public void showAllFoodItems();
}