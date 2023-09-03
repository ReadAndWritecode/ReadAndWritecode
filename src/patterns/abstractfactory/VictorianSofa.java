package patterns.abstractfactory;

// 2. Конкретный продукт "Диван в стиле Викторианский"
class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Лежим на диване в стиле Викторианский");
    }
}