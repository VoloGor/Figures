/**
 * Created by Volodymyr.Goral
 * Date 08.12.22
 * Triangle3 class
 * As a solution to print out the right side triangle
 */
public class Triangle3 extends Figures {
    void triangle3() {
        for (int i = 0; i < size; i++) {
            for (int j = 2 * (size - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
