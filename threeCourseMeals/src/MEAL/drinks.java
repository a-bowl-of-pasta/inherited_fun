package MEAL;

public class drinks {
    boolean isCarbonated;
    boolean isAlcoholic;
    boolean isMixed;
    boolean isHot;
    String descriptionOfDrink; // what the drink is
    String bestPairedWith;
    String flavorProfile; // how the drink tastes

    //Setters
    //Every drink is alcoholic- because why not?
    void setAlcoholism() {this.isAlcoholic = true;}
    void setCarbonated() {this.isCarbonated = isCarbonated;}
    void setMixed(boolean isAlcoholic){
        if (isAlcoholic)
        {
            this.isMixed = true;
        }
        else {
            this.isMixed = false;
        }
    }
    void setHot(int temp) {
        if (temp > 160)
        {
            this.isHot = true;
        }
        else
        {
            this.isHot = false;
        }
    }
    void setDescriptionOfDrink() { this.descriptionOfDrink = descriptionOfDrink; }
    void setBestPairedWith() { this.bestPairedWith = bestPairedWith; }
    void setFlavorProfile() { this.flavorProfile = flavorProfile; }

    //Getters
    boolean getAlcoholism() {return isAlcoholic;}
    boolean getCarbonated() {return isCarbonated;}
    boolean getMixed() {return isMixed;}
    boolean getHot() {return isHot;}
    String getDescription() {return descriptionOfDrink;}
    String getBestPairedWith() {return bestPairedWith;}
    String getFlavorProfile() {return flavorProfile;}











}
