package MEAL;

public class ingredients {

    boolean isFresh; // ingredients, food, and drinks are fresh
    int quantity; // number of meals, drinks, and ingredients
    String nameOf; // name of the drink, ingredient, or meal
    boolean garnish; // if drink has garnish, meal has garnish, ingredient is garnish
    String measureUnits; // units to measure ingredient or drink


    // ==== constructor ===

    public ingredients()
    {
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
   public void setQuantity(int quantity){this.quantity = quantity;}
   public void setNameOf(String nameOf){this.nameOf = nameOf;}

   public boolean getFresh(){return isFresh;}
   public boolean getGarnish(){return garnish;}
   public String getMeasureUnits(){return measureUnits;}
   public int getQuantity(){return quantity;}
   public String getNameOf(){return nameOf;}



}
