/**
 * Class for helping of report. It could print each shape which is input of function report
 * showed by a point: (x,y)
 * @version 1.0
 * @author Van Tinh Chu, Florian
 */

import java.io.FileWriter;
import java.io.IOException;

public class Reporter{
    public static void report(Shape s){
        try {
            FileWriter myWriter = new FileWriter("report.txt");
            String stringOutput = s.toString();
            myWriter.write(stringOutput);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
