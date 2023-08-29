package solid.ocp.correct;

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}