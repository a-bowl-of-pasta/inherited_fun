package MEAL;

public class ingredients {

    boolean isFresh; // ingredients, food, and drinks are fresh
    private int quantity; // number of ingredients
    String nameOf; // name of the drink, ingredient, or meal
    boolean garnish; // if drink has garnish, meal has garnish, ingredient is garnish
    String measureUnits; // units to measure ingredient or drink
    private static int numOf; // sets the total number of drinks, meals, or ingredients to be used


    // ==== constructor ===

    public ingredients()
    {
        setNumOf(1); // default at least 1 exists
        nameOf = "";
        isFresh = false;
        garnish = false;
        measureUnits = "imperial system";
        quantity = 1;
    }

    public ingredients(String nameOf)
    {
        this.nameOf = nameOf;
        isFresh = false;
        garnish = false;
        measureUnits = "imperial system";
        quantity = 1;
    }
    public ingredients(String nameOf, int quantity)
    {
        this.nameOf = nameOf;
        isFresh = false;
        garnish = false;
        measureUnits = "imperial system";
        this.quantity = quantity;

    }

    // ==== methods used ===
    void useIngredient(int num)
    {
       if(quantity >= num){
           quantity -= num;
       }
    }
   public void isFresh(){this.isFresh = true;}
   public void isGarnish(){this.garnish = true;}
   public void setMeasureUnits(String measurmentSystem){this.measureUnits = measurmentSystem;}
   public void setIngredientQuantity(int quantity){this.quantity = quantity;}
    public static void setNumOf(int numOf){ingredients.numOf = numOf;}
   public void setNameOf(String nameOf){this.nameOf = nameOf;}

   public boolean getFresh(){return isFresh;}
   public boolean getGarnish(){return garnish;}
   public String getMeasureUnits(){return measureUnits;}
   public int getQuantity(){return quantity;}
   public String getNameOf(){return nameOf;}
    public static int getNumOf(){return ingredients.numOf;}

    @Override
    public String toString() {
        String theString = nameOf + "\n";
        if (garnish)
            theString += "- the ingredient is a garnish\n";
        if (isFresh) {
            theString += "- " + quantity + " of the ingredient available\n";
            theString += "- measured with " + measureUnits + "\n";
        } else
            theString += "- ingredients are expired 0 available\n";

        return theString;
    }
}
