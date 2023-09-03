package patterns.abstractfactory;

// 2. Конкретный продукт "Стул в стиле Модерн"
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сидим на стуле в стиле Модерн");
    }
}