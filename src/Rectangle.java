/**
 * Class for geometrical Rectangle. Each Rectangle has an x and y edge
 * @version 1.0
 * @author Van Tinh Chu, Florian
 */

public class Rectangle extends Shape{
    private double xDelta;
    private double yDelta;

    Rectangle(double xDelta, double yDelta){
        super(xDelta, yDelta);
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    double circumference(double x, double y){
        return (x + y) * 2 * 2 ;
    }

    double area(double x, double y){
        return (x * 2 ) * (y * 2);
    }

    @Override
    public String toString() {
        return " xDelta is " + xDelta * 2  + "\n" + "yDelta is " + yDelta * 2;
    }
}
