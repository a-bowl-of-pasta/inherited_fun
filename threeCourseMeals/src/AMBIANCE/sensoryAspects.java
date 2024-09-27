package AMBIANCE;

public class sensoryAspects
{
    String aroma; // citrus, woods, etc
    String musicGenre; // genre of Music
    String sourceOfScent; // candals, reed diffusors, etc
    boolean isLiveMusic;

    void setScent(String aroma){this.aroma = aroma;}
    void setMusic(String genre){musicGenre = genre;}
    void setSource(String sourceOfAroma) {sourceOfScent = sourceOfAroma;}
    void setLiveMusic(boolean liveMusic){isLiveMusic = liveMusic;}
    String getAroma(){return aroma;}
    String getGenre(){return musicGenre;}
    String getSource(){return sourceOfScent;}
    boolean getLiveMusic(){return isLiveMusic;}



}
