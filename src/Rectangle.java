/**
 * Created by Volodymyr.Goral
 * Date 08.12.22
 * Rectangle class
 * As a solution to print out the rectangle
 * One more scanner was implemented here to define the width of the rectangle
 */

import java.util.Scanner;

public class Rectangle extends Figures {
    void rectangle() {
        Scanner widthScanner = new Scanner(System.in);
        System.out.println("Please enter the width");
        int width = widthScanner.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
