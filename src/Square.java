/**
 * Created by Volodymyr.Goral
 * Date 08.12.22
 * Square class
 * As a solution to print out the square
 */
public class Square extends Figures {
    void square() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}