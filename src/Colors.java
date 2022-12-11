/**
 * Created by Volodymyr.Goral
 * Date 08.12.22
 * Colors enumn
 * Was created but not implemented to the main functionality
 */
public enum Colors {
    GREY(142, 142, 147),
    RED(255, 59, 48),
    GREEN(76, 217, 100),
    PURPLE(88, 86, 214);

    private Colors(final Integer red, final Integer green, final Integer blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    private final Integer red, green, blue;

    public String getRGB() {
        return red + "," + green + "," + blue;
    }
}