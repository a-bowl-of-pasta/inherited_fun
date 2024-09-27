package MEAL;

public class meal extends ingredients
{
    boolean isCooked; // false- sushi ; true- chicken
    String mealDescription;
    boolean mainDish;
    boolean sideDish;
    String cuisineType; //mexican, american, italian, etc
    // ==== constructor ====
    public meal()
    {
        isFresh = true;
        nameOf = "";
        garnish = false;
        isCooked = false;
        mainDish = false;
        sideDish = false;
        cuisineType = "unspecified";
        mealDescription = "";

    }
    public meal(boolean isMainMeal, String foodType){
        isCooked = false;
        if(isMainMeal)
        {
            mainDish = true;
            sideDish = false;
        }else
        {

            mainDish = false;
            sideDish = true;
        }

        cuisineType = foodType;
        mealDescription = "";
    }
    public meal(String foodDescription)
    {

        isCooked = false;
        mainDish = false;
        sideDish = false;
        cuisineType = "unspecified";
        mealDescription = foodDescription;
    }

    // ==== methods =====
    public void setMealDescription(String mealDescription){this.mealDescription = mealDescription; }
    public void isCooked() {isCooked = true;}
    public void isMainDish() {mainDish = true; sideDish = false; }
    public void isSideDish(){ sideDish = true; mainDish = false; }

    public void setCuisineType(String type){ cuisineType = type;}

    public String getMealDescription() {return mealDescription;}
    public boolean getIsCooked(){return isCooked;}
    public boolean getIsMainDish(){return mainDish;}
    public boolean getIsSideDish(){return sideDish;}
    public String getCuisineType(){return cuisineType;}

    // ==== to String Method =====


    private String foodComp(String mealDesc) {

        if (isCooked) {
          mealDesc += "- has been cooked\n";
        } else {
           mealDesc += "- we hate you, you get raw food\n";
        }
        if(mainDish)
        {
             mealDesc += "- this is the main dish\n";
        }else
        {
            mealDesc += "- this is a side dish\n";
        }

        return mealDesc;
    }
    @Override
    public String toString() {

        String mealDesc = getNameOf() + "\n";
        mealDesc = foodComp(mealDesc);
        if(garnish)
        {
            mealDesc+= "- has garnish\n";
        }
        if(mealDescription.isBlank() != true){
            mealDesc += "\nMEAL DESCRIPTION\n\n" + mealDescription;
        }
        return mealDesc;
    }

}
