/**
 * Created by Volodymyr.Goral
 * Date 08.12.22
 * Main class
 * Was created to call the needed class that prints required figure
 * If some figures not required, please comment the appropriate rows
 */
public class Main {
    public static void main(String[] args) {

        Square square = new Square();
        square.square();
        Rectangle rectangle = new Rectangle();
        rectangle.rectangle();
        Triangle leftSide = new Triangle();
        leftSide.triangle();
        Triangle1 invertedLeft = new Triangle1();
        invertedLeft.triangle1();
        Triangle2 isosceles = new Triangle2();
        isosceles.triangle2();
        Triangle3 rightSide = new Triangle3();
        rightSide.triangle3();
        Triangle4 invertedRight = new Triangle4();
        invertedRight.triangle4();
    }
}