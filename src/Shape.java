/**
 * Class for geometrical shapes. Each shape hass an explicit origin
 * showed by a point: (x,y)
 * @version 1.0
 * @author Van Tinh Chu, Florian
 */
public class Shape {
    private double x;
    private double y;

    Shape(double x, double y){
            this.x = x;
            this.y = y;
    }

    /**
     * Caculate the are of a shape.
     * The base shape is just point so it has no area
     * @return the area of the shape
     */
    double area(double x, double y){
        return 0;
    }

    /**
     * Caculate the circumference of a shape. The base shape is just point so. It has no circumference
     * @return the circumference of a shape 
     */
    double circumference(double x, double y){
        return 0;
    }

    /**
     * constructs a textual representation of the origin in the form: "(x, y)"
     * @return the origin on textual representation
     */
    String textualBuild(){
        return "the orgin codiration are " + x + " and " + y;
    }

    /**
     * constructs a textual representation of the object.
     * @return the current object in a textual representation
     */
    String textualObject(){
        return this.toString();
    }
    
}
