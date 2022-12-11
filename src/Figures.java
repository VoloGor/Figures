/**
 * Created by Volodymyr.Goral
 * Date 08.12.22
 * Figures class
 * Was created for scanner methode that required each class
 * Also was implemented an exception for bad values
 */

import java.util.Scanner;

public abstract class Figures {
    static Integer size;

    public Figures() {
        System.out.println("Please enter number");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if (size <= 1) {
            throw new ArithmeticException("The entered number should be not less than 2");
        } else {
            System.out.println("Here you are");
        }
    }
}
