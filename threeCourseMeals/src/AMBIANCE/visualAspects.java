package AMBIANCE;

public class visualAspects {

    String typeOfLighting; // natural lighting, lamps, overheads, etc
    String[] colorPalet; // the colorPalet
    int lightIntensity; // brightness level 1-10
    String decoreStyle; // modern, rustic, comfort

    void setLighting(String type){typeOfLighting = type;}
    void setColor(String[] color){colorPalet = color;}
    void setLightBrightness(){}
    void setDecore(){}
    String getLighting(){return typeOfLighting; }
    String[] getColor(){ return colorPalet;}
    String getDecore(){return decoreStyle;}
    int getBrightness(){return lightIntensity;}


}
