package MEAL;

public class ingredients {

    boolean isFresh;
    int quantity;
    String ingredientName;
    boolean isGarnish;
    String measureUnits;

    void useIngredient(int num)
    {
       if(quantity >= num){
           quantity -= num;
       }
    }

    void setFresh(){this.isFresh = true;}
    void setGarnish(){this.isGarnish = true;}
    void setMeasureUnits(){this.measureUnits = "grams";}

    boolean getFresh(){return isFresh;}
    boolean getGarnish(){return isGarnish;}
    String getMeasureUnits(){return measureUnits;}




}
