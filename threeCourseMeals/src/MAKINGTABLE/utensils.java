package MAKINGTABLE;

public class utensils {
    static int utensilPerPerson;
    String typeOfUtensil;
    String utensilMaterial;
    boolean honeySpoon; // in case it's the spoon that ran with the dish
    boolean isStraw;
    boolean isSilly;


    static void setNumOfUtensils(int num) {utensilPerPerson = num; }
    void setMaterial(){}
    void setTypeOfUtensil(){}
    void setHoneySpoon(){}
    void setStraw(){}
    void setSilliness(){}
    String getUtensil(){return typeOfUtensil;}
    String getMaterial(){return utensilMaterial;}
    static int getUtensilNums(){return utensilPerPerson;}
    boolean getHoneySpoon(){return honeySpoon;}
    boolean getIsStraw(){return isStraw;}
    boolean getIsSilly(){return isSilly;}




}
