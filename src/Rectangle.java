/**
 * Class for geometrical Rectangle. Each Rectangle has an x and y edge
 * @version 1.0
 * @author Van Tinh Chu, Florian
 */

public class Rectangle extends Shape{
    private double xDelta;
    private double yDelta;

    /**
     * Constructor of rechtangle
     * @param xDelta
     * @param yDelta
     */
    Rectangle(double xDelta, double yDelta){
        super(xDelta, yDelta);
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    /**
     * caculate circum of rechtangle
     * @param x
     * @param y
     * @return double number of circum
     */
    double circumference(double x, double y){
        return (x + y) * 2 * 2 ;
    }

    /**
     * caculate the area of rectangle with the formel (x + y) *2
     * @param x
     * @param y
     * @return double number of area
     */
    double area(double x, double y){
        return (x * 2 ) * (y * 2);
    }

    /**
     * @overwrite function toString to show the object of rechtangle
     * @return
     */
    @Override
    public String toString() {
        return " xDelta is " + xDelta * 2  + "\n" + "yDelta is " + yDelta * 2;
    }
}
