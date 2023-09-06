package patterns.decorator;

// Конкретный компонент
class SimpleCoffee implements Coffee {

    @Override
    public double getCost() {
        return 1.0;
    }
    @Override
    public String getDescription() {
        return "Простой кофе";
    }
}