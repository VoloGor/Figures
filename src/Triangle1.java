/**
 * Created by Volodymyr.Goral
 * Date 08.12.22
 * Triangle1 class
 * As a solution to print out the inverted left side triangle
 */
public class Triangle1 extends Figures{
    void triangle1() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
