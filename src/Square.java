/**
 * Class for geometrical shapes. Each square has an edge delta
 * @version 1.0
 * @author Van Tinh Chu, Florian
 */
public class Square extends Shape{
    private double delta;
    private double x;
    private double y;

    Square(double x,double y, double delta){
        super(x, y);
        this.x = x;
        this.y = y;
        this.delta = delta;
    }

    double circumference(double x, double y){
        return delta * 2 * 4;
    }

    double area(double x, double y){
        return (delta + delta) * (delta + delta);
    }

    @Override
    public String toString() {
        return " the edge is " + delta * 2;
    }
}
