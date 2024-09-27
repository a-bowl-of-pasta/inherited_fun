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



}
