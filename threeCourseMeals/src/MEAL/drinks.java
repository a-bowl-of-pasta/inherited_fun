package MEAL;

import java.util.Objects;

public class drinks {
    boolean isAlcoholic;
    boolean isMixed;
    String descriptionOfDrink; // what the drink is


    //Setters

    //Every drink is alcoholic- because why not?
    public void setAlcoholism() {this.isAlcoholic = true;}

    public void setMixed(String drankname){
        if (Objects.equals(drankname, "bloody mary"))
        {
            this.isMixed = true;
        }
        else if (Objects.equals(drankname, "beer") || Objects.equals(drankname, "wine")){
            this.isMixed = false;
        }
    }

    public void setDescriptionOfDrink(String drankname) {
        if (Objects.equals(drankname, "bloody mary")){
            this.descriptionOfDrink = "a cocktail that typically contains vodka, tomato juice, and other flavorings and spices.";
        }
        else if (Objects.equals(drankname, "beer")){
            this.descriptionOfDrink = "an alcoholic drink made from malt and flavored with hops.";
        }
        else if (Objects.equals(drankname, "wine")){
            this.descriptionOfDrink = "an alcoholic beverage made from fermented fruit, typically grapes.";
        }

    }

    //Getters
    public boolean getAlcoholism() {return isAlcoholic;}
    public boolean getMixed() {return isMixed;}
    public String getDescription() {return descriptionOfDrink;}











}
