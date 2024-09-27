package MEAL;

import java.util.Objects;

public class meal
{
    boolean isCooked; //
    String mealDescription;
    String cuisineType; //mexican, american, italian, etc

    public void setMealDescription(String mealName){
        if (Objects.equals(mealName, "sushi"))
        {
            this.mealDescription = "a Japanese dish that's made from" +
                    " vinegared rice and a variety of other ingredients," +
                    " such as seafood, vegetables, or egg.";
        }
        else if (Objects.equals(mealName, "chicken"))
        {
            this.mealDescription = "It's chicken. Kind of a bland choice to make?";
        }
    }
    public void isCooked(String mealName) {
       if (Objects.equals(mealName, "sushi"))
       {
           this.isCooked = false;
       }
       else if (Objects.equals(mealName, "chicken"))
       {
           this.isCooked = true;
       }
    }


    public void setCuisineType(String mealName) {
        if(Objects.equals(mealName, "sushi")){
            this.cuisineType = "Asian";
        }
        else if (Objects.equals(mealName, "chicken"))
            this.cuisineType = "Chicken";
    }

    public String getMealDescription() {return mealDescription;}
    public boolean getIsCooked(){return isCooked;}
    public String getCuisineType(){return cuisineType;}






}
