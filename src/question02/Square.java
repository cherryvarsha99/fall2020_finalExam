package question02;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class Square extends GeometricObject implements Colorable {

    private double side;

    /**
     *
     * @param side
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     *
     * @return
     */
    public double getSide() {
        return side;
    }

    /**
     *
     * @param side
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     *
     * @return
     */
    public double getArea() {

        return side * side;

    }

    /**
     *
     */
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

}
