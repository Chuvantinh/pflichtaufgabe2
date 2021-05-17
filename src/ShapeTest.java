import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @org.junit.jupiter.api.Test
    void test() {
        // test for shape class
        Shape shape1 = new Shape(10, 40);
        assertEquals(0, shape1.area(10, 40)) ;
        assertEquals(0, shape1.circumference(10, 40)) ;


        // test for Rectangle
        double x = 20; double y = 30; double xDelta = 35; double yDelta = 15;
        Rectangle recObj = new Rectangle(xDelta, yDelta);
        assertEquals(2100, recObj.area(xDelta, yDelta));
        assertEquals(200, recObj.circumference(xDelta, yDelta));

        // test for Square
        Square square = new Square(30, 20, 5);
        assertEquals(100, square.area(30, 20));
        assertEquals(40, square.circumference(30, 20));

        // tes for Circle
        Circle circle = new Circle(40, 10, 25);
        assertEquals(1962.5, circle.area(40, 10));
        assertEquals( 157, circle.circumference(40, 10));

        Reporter.report(recObj);
    }
}
