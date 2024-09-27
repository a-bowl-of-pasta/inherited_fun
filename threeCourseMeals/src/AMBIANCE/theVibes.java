package AMBIANCE;

public class theVibes {
    String timeOfDay;
    String vibe;
    static boolean isIndoor;
    static boolean hasMusic;
    static boolean hasScents;

    static void setIndoor(boolean indoor){isIndoor = indoor;}
    static void setHasMusic(boolean music){hasMusic = music;}
    static void setHasScents(boolean scents){hasScents = scents;}
    void setTimeOfDay(String tod){timeOfDay = tod;}
    void setVibe(String v){vibe = v;}
    String getTOD(){return timeOfDay;}
    String getVibe(){return vibe;}
    boolean getIsIndoor(){return isIndoor;}
    boolean getHasMusic(){return hasMusic;}
    boolean getHasScents(){return hasScents;}


}
