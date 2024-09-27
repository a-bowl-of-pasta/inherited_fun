package MAKINGTABLE;

public class diningSetup {
    static String tableCenterPiece;
    static int seatNums;
    String classiness;
    boolean hasMainMeal;




    void setClassiness(String claaaasy){ classiness = claaaasy;}
    static void setSeatNum(int seats){seatNums = seats;}
    void setCenterPiece(String centerPiece){ tableCenterPiece = centerPiece;}
    void hasMainMeal(boolean mainMeal){hasMainMeal = mainMeal;}
    String getClassiness(){return classiness;}
    static int getSeatNum(){return seatNums;}
    String getCenterPiece(){return tableCenterPiece;}
    boolean getHasMainMeal(){return hasMainMeal;}


}
/*
class DynacArray<T>
{
    T[] arrayOfWhatever;
    int index;

    DynacArray(T...vals )
    {
        arrayOfWhatever = (T[]) new Object[vals.length];
        index
    }



}
*/
