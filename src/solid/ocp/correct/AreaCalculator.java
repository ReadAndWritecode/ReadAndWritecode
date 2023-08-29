package solid.ocp.correct;

/**
 * В этом примере мы внедрили интерфейс Shape, который определяет метод calculateArea().
 * Классы Rectangle и Square реализуют этот интерфейс и предоставляют свои собственные способы вычисления площади.
 * Теперь при добавлении новых фигур не требуется изменять класс AreaCalculator, что соответствует принципу OCP
 */
class AreaCalculator {

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}