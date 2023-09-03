package patterns.abstractfactory;

// 2. Конкретный продукт "Диван в стиле Модерн"
class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Лежим на диване в стиле Модерн");
    }
}