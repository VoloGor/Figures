/**
 * Created by Volodymyr.Goral
 * Date 08.12.22
 * Triangle class
 * As a solution to print out the left side triangle
 */
public class Triangle extends Figures {
    void triangle() {
        String s = "* ";
        for (int i = 0; i < size; i++) {
            System.out.print(s);
            s = s + "* ";
            System.out.println();
        }
    }
}
