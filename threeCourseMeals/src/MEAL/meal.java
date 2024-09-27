package MEAL;

public class meal
{
    boolean isCooked; // false- sushi ; true- chicken
    String mealDescription;
    boolean isMainDish;
    boolean isSideDish;
    String cuisineType; //mexican, american, italian, etc

    void setMealDescription(){this.mealDescription = mealDescription; }
    void isCooked(String mealName) {
       if (mealName == "sushi")
       {
           this.isCooked = true;
       }
       else if (mealName == "chicken")
       {
           this.isCooked = false;
       }
    }

    void isMainDish(String mealName) {
        if (mealName == "sushi" || mealName == "chicken")
        {
            this.isMainDish = true;
        }
        else {
            this.isMainDish = false;
        }
    }

    void isSideDish(String mealName) {
        if(mealName == "sushi" || mealName == "chicken") {
            this.isSideDish = false;
        }
        else {
            this.isSideDish = true;
        }
            ;
    }

    void setCuisineType(String mealName) {
        if(mealName == "Sushi"){
            this.cuisineType = "Asian";
        }
        else if (mealName == "chicken")
            this.cuisineType = "Chicken";
    }

    String getMealDescription() {return mealDescription;}
    boolean getIsCooked(){return isCooked;}
    boolean getIsMainDish(){return isMainDish;}
    boolean getIsSideDish(){return isSideDish;}
    String getCuisineType(){return cuisineType;}






}
