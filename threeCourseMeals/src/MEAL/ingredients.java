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


}
