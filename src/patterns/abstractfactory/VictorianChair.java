package patterns.abstractfactory;

// 2. Конкретный продукт "Стул в стиле Викторианский"
class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сидим на стуле в стиле Викторианский");
    }
}