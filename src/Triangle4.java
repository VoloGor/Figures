/**
 * Created by Volodymyr.Goral
 * Date 08.12.22
 * Triangle4 class
 * As a solution to print out the inverted right side triangle
 */
public class Triangle4 extends Figures {
    void triangle4() {
        for (int i = size; i >= 0; i--) {
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
