import MEAL.*;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    static ArrayList<meal> foodList;
    static ArrayList<drinks> drinkList;
    static ArrayList<ingredients> ingList;
    // ==== methods for adding drink info =====
    public static void addDrinkInfo()
    {
        drinkList = new ArrayList<drinks>();
        drinks drink = new drinks("drink 1");
        drinks.setNumOf(3);

        drinkList.add(drink);
        int numOfDrinks = drinks.getNumOf();

        for(int i = 1; i < numOfDrinks; i++) {
            drinks newDrink = new drinks("drink " + (i +1));
            drinkList.add(newDrink);
        }

    }
    // ==== methods for adding meal info =====
    public static void addMealInfo()
    {
        foodList = new ArrayList<meal>();
        meal yum = new meal("meal 1");
        meal.setNumOf(2);

        foodList.add(yum);
        int numOfMeals = meal.getNumOf();

        for(int i = 1; i < numOfMeals; i++) {
            meal newMeal = new meal("meal " + (i+1));
            foodList.add(newMeal);
        }
    }
    // ==== methods for adding ingredient info =====
    public static void addIngredientInfo()
    {
        ingList = new ArrayList<ingredients>();
        ingredients ing = new ingredients("ingredient 1");
        ingredients.setNumOf(2);

        ingList.add(ing);
        int numOfIng = ingredients.getNumOf();

        for(int i = 1; i < numOfIng; i++) {
            ingredients newIng = new ingredients("ingredient " + (i+1));
            ingList.add(newIng);
        }

    }

    public static void main(String[] args) {

        System.out.println("this is a meal planning program");
        System.out.println("enter the required information");

        addIngredientInfo();
        addDrinkInfo();
        addMealInfo();

        System.out.println("the ingredient list is :: ");

        System.out.println("=================");
        for(ingredients in : ingList)
        {
            System.out.println(in.toString() );
        }
        System.out.println("=================");
        for(drinks dl : drinkList)
        {
            System.out.println(dl.toString() );
        }
        System.out.println("=================");
        for(meal ml : foodList)
        {
            System.out.println(ml.toString() );
        }
    }
}
