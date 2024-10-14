/**
 * Class to represent a point on a map and its associated data.
 * 
 * @author Brendan MacCoy
 */

public class MapNode {

    double x; // x coordinate
    double y; // y coordinate
    double elevation; // elevation at this point

    /**
     * Default Constructor
     */
    public MapNode() {
        this.x = 0;
        this.y = 0;
        this.elevation = 0;
    }

    /**
     * Coordinate Constructor
     */
    public MapNode(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Elecation Constructor
     */
    public MapNode(double x, double y, double elevation) {
        super(x, y);
        this.elevation = elevation;
    }

    /**
     * Sets the x-coordinate
     */
    public void setX(double x) {this.x = x;}

    /**
     * Sets the y-coordinate
     */
    public void setY(double y) {this.y = y;}

    // Returns the x value 
    public double getX(double x) {return this.x;}

    // Returns the y value
    public double getY(double y) {return this.y;}
    
    /**
     * Returns the elevation
     */
    public double getElevation() {return this.elevation;}

    /**
     * Returns the difference between two elevation points
     */
    public double elevationDiff(MapNode point) {
        return this.elevation - MapNode.getElevation;
    }

}
