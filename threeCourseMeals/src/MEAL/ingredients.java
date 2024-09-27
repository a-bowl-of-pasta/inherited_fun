package MEAL;

import java.util.Objects;

public class ingredients {

    boolean isFresh;
    String ingredientName;
    boolean isGarnish;

    public void setIngredientName(String mealName) {
        if (Objects.equals(mealName, "sushi"))
        {
            this.ingredientName = "Rice, Salt, Seaweed, Imitation Crab, Vegetables.";
        }
        else if (Objects.equals(mealName, "chicken"))
        {
            this.ingredientName = "Chicken.";
        }

    }
    public void setFresh(){this.isFresh = true;}
    public void setGarnish(){this.isGarnish = true;}

    public boolean getFresh(){return isFresh;}
    public boolean getGarnish(){return isGarnish;}
    public String getIngredientName(){return ingredientName;}




}
