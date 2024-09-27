package MEAL;

public class meal
{
    boolean isCooked; // false- sushi ; true- chicken
    String mealDescription;
    boolean mainDish;
    boolean sideDish;
    String cuisineType; //mexican, american, italian, etc
    // ==== constructor ====
    public meal()
    {
        
    }


    // ==== methods =====
    public void setMealDescription(String mealDescription){this.mealDescription = mealDescription; }
    public void isCooked() {isCooked = true;}
    public void isMainDish() {mainDish = true; sideDish = false; }
    public void isSideDish(){ sideDish = true; mainDish = false; }

    public void setCuisineType(String type){ cuisineType = type;}

    public String getMealDescription() {return mealDescription;}
    public boolean getIsCooked(){return isCooked;}
    public boolean getIsMainDish(){return isMainDish;}
    public boolean getIsSideDish(){return isSideDish;}
    public String getCuisineType(){return cuisineType;}






}
