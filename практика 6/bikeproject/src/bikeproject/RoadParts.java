package bikeproject;

public interface RoadParts {
    String terrain = "track_racing";  // константа для типа местности

 
    int getTyreWidth();
    void setTyreWidth(int newValue);
    
    int getPostHeight();
    void setPostHeight(int newValue);
}