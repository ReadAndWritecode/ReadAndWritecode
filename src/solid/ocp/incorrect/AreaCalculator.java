package solid.ocp.incorrect;

/**
 * В этом примере при добавлении новой фигуры (например, квадрата) пришлось бы изменять существующий класс AreaCalculator,
 * что нарушает принцип OCP.
 */
class AreaCalculator {

    public double calculateArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}