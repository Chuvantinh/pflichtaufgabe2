/**
 * Class for geometrical Circle. Each shape hass an radius
 * showed by a point: (x,y)
 * @version 1.0
 * @author Van Tinh Chu, Florian
 */
public class Circle extends Shape{
    private double radius;
    private double x, y;
    private double pi = 3.14;

    Circle(double x, double y, double radius){
        super(x, y);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    double circumference(double x, double y){
        return radius * 2 * pi;
    }

    double area(double x, double y){
        return radius * radius * pi;
    }

    @Override
    public String toString() {
        return " the radius of circle is " + radius;
    }
}
