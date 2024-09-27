package MEAL;

public class drinks extends ingredients{
    boolean isCarbonated;
    boolean isAlcoholic;
    boolean isMixed;
    boolean isHot;
    String descriptionOfDrink; // what the drink is
    String bestPairedWith;
    String flavorProfile; // how the drink tastes

    // ===== constructors =====

    public drinks()
    {
        isFresh = true;
        nameOf = "";
        garnish = false; 
        isCarbonated = false;
        isAlcoholic = false;
        isMixed = false;
        isHot = false;
        descriptionOfDrink = "";
        bestPairedWith = "";
        flavorProfile = "";
    }
    public drinks(boolean isHot, boolean hasAlcohol,boolean isMixed)
    {
        isCarbonated = false;
        isAlcoholic = hasAlcohol;
        this.isMixed = isMixed;
        this.isHot = isHot;
        descriptionOfDrink = "";
        bestPairedWith = "";
        flavorProfile = "";
    }


    // ==== methods ====
    //Setters
    //Every drink is alcoholic- because why not?

    public void setAlcoholism() {this.isAlcoholic = true;}
    public void setCarbonated(boolean isCarbonated) {this.isCarbonated = isCarbonated;}
    public void setMixed(boolean isMixed) {this.isMixed = isMixed;}
    public void setHot(int temp) { if (temp >= 160) {this.isHot = true;} }

    public void setDescriptionOfDrink(String descriptionOfDrink) { this.descriptionOfDrink = descriptionOfDrink; }
    public void setBestPairedWith(String bestPairedWith) { this.bestPairedWith = bestPairedWith; }
    public void setFlavorProfile(String flavorProfile) { this.flavorProfile = flavorProfile; }

    // Getters
    public boolean getAlcoholism() {return isAlcoholic;}
    public boolean getCarbonated() {return isCarbonated;}
    public boolean getMixed() {return isMixed;}
    public boolean getHot() {return isHot;}
    public String getDescription() {return descriptionOfDrink;}
    public String getBestPairedWith() {return bestPairedWith;}
    public String getFlavorProfile() {return flavorProfile;}
    // to string method


    //  ------ looks messy, I know
    private String alcoholicComp(String drinkToString) {

        if (isAlcoholic) {
            if (isMixed) {
                drinkToString += "- alcohol cocktail\n";
            } else {
                drinkToString += "- contains alcohol\n";
            }
        } else {
            if (isMixed) {
                drinkToString += "- non Alcoholic mocktail\n";
            } else if (isCarbonated) {
                drinkToString += "- soft drik\n";
            } else {
                drinkToString += "- non alchoholic\n";
            }
        }
        if(isHot)
        {
            drinkToString += "- hot\n";
        }else
        {
            drinkToString += "- cold\n";
        }

        return drinkToString;
    }
    @Override
    public String toString() {

        String drinkToString = getNameOf() + "\n";
        drinkToString = alcoholicComp(drinkToString);
        if(garnish)
        {
            drinkToString+= "- has garnish\n";
        }
        return drinkToString;
    }
}
