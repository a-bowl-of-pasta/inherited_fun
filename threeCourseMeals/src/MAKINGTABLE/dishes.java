package MAKINGTABLE;

public class dishes extends diningSetup{

    static int dishesPerPerson; // for 1 person
    String typeOfDish;
    boolean isDecorative;
    String dishSize;
    String dishMaterial;
    boolean holdsMainMeal;
    boolean isPlate; // only plates can run away with spoon
    boolean ranAwayWithSpoons; // the dish that ran away with the spoon

    static void setNeededDishes(int num) {dishesPerPerson = num;}
    void setTypeOfDish(String type) { typeOfDish = type;}
    void setIsDecorative(boolean isDecorative) { isDecorative = isDecorative;}
    void setDishSize(String dishSize) {}
    void setDishMaterial(String dishMaterial) {}
    void setHoldsMainMeal(boolean holdsMainMeal) {}
    void setIsPlate(boolean plate) { isPlate = plate;}
    void withTheSpoon(boolean ranAwayWithSpoons) {ranAwayWithSpoons = ranAwayWithSpoons;}
    int getDishesPP(){return dishesPerPerson;}
    String getTypeOfDish(){return typeOfDish;}
    String getDishSize(){return dishSize;}
    String getdishMaterial(){return dishMaterial;}
    boolean getHoldsMainMeal(){return holdsMainMeal;}
    boolean getIsPlate(){return isPlate;}
    boolean getIsDecorative(){return isDecorative;}
    boolean getRanAwayWithSpoons(){return ranAwayWithSpoons;}



}
