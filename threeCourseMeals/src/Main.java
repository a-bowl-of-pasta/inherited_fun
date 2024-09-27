//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import MEAL.drinks;
import MEAL.ingredients;
import MEAL.meal;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        meal meal = new meal();
        drinks drank = new drinks();
        ingredients ingred = new ingredients();

        System.out.println("This is a mealPlanner program (Enter answers in all lowercase)");
        System.out.println("Answer the questions to plan the meal");

        System.out.println("What type of meal would you like? (Type the food name below)");
        System.out.println("1. Sushi");
        System.out.println("2. Chicken");
        String mealName = sc.nextLine();

        //Sets meal
        meal.setMealDescription(mealName);
        meal.isCooked(mealName);
        meal.setCuisineType(mealName);

        System.out.println("Second: What type of alcoholic drink would you like? (No regular drinks in this program)");
        System.out.println("1. Beer");
        System.out.println("2. Wine");
        System.out.println("3. Bloody Mary");
        String drankName = sc.nextLine();

        //Sets drink
        drank.setDescriptionOfDrink(drankName);
        drank.setMixed(drankName);
        drank.setAlcoholism();

        //Sets ingredients
        ingred.setIngredientName(mealName);
        ingred.setFresh();
        ingred.setGarnish();

        //Prints out everything
        System.out.println("Here is information about your meal!");
        System.out.println("Food name: " + mealName);
        System.out.println("Food description: " + meal.getMealDescription());

        if(drank.getAlcoholism()){
            System.out.println("Drink name: " + drankName + "-  " + drank.getDescription());
        }

        if(drank.getMixed())
        {
            System.out.println("This is a mixed drink!");
        }
        else{
            System.out.println("This is not a mixed drink!");
        }

        System.out.println("Ingredients for meal: " + ingred.getIngredientName());

        if(ingred.getFresh() && ingred.getGarnish()){
            System.out.println("This dish is fresh and can be set with garnish");
        }

        if(meal.getIsCooked())
        {
            System.out.println("This is a cooked meal!");
        }
        else {
            System.out.println("This is not a cooked meal!");
        }

        System.out.println("Cuisine Type: " + meal.getCuisineType());




    }
}