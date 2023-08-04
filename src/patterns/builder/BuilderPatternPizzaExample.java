package patterns.builder;

// Клиентский код
public class BuilderPatternPizzaExample {

    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new ConcretePizzaBuilder();
        PizzaOrder pizzaOrder = pizzaBuilder
                .selectPizzaType("Diablo")
                .addExtraCheese(true)
                .addExtraSauce(false)
                .build();

        System.out.println("Pizza order:\n" + pizzaOrder.toString());
    }
}