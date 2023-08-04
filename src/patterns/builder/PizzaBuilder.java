package patterns.builder;

// Интерфейс для строителя пиццы
interface PizzaBuilder {
    PizzaBuilder selectPizzaType(String type);

    PizzaBuilder addExtraCheese(boolean isExtraCheese);

    PizzaBuilder addExtraSauce(boolean isExtraSauce);

    PizzaOrder build();
}