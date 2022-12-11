/**
 * Created by Volodymyr.Goral
 * Date 08.12.22
 * Triangle class
 * As a solution to print out the isosceles triangle
 */
public class Triangle2 extends Figures {
    void triangle2() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int star = i; star > 0; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
