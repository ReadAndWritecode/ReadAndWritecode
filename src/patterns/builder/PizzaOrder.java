package patterns.builder;

// Класс заказа на пиццу
class PizzaOrder {
    private String pizzaType;
    private boolean isExtraCheese;
    private boolean isExtraSauce;


    public PizzaOrder(String pizzaType, boolean isExtraCheese, boolean isExtraSauce) {
        this.pizzaType = pizzaType;
        this.isExtraCheese = isExtraCheese;
        this.isExtraSauce = isExtraSauce;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza Type: ").append(pizzaType).append("\n");
        sb.append("Extra Cheese: ").append(isExtraCheese).append("\n");
        sb.append("Extra Sauce: ").append(isExtraSauce).append("\n");
        return sb.toString();
    }

}