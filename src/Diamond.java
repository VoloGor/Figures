/**
 * Created by Volodymyr.Goral
 * Date 08.12.22
 * Diamond class
 * As a solution to print out the diamond
 */
public class Diamond extends Figures {
    void diamond() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int star = i; star > 0; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int j = size; j > 0; j--) {
            for (int k = 0; k < size - j; k++) {
                System.out.print(" ");
            }
            for (int f = 0; f < j; f++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

