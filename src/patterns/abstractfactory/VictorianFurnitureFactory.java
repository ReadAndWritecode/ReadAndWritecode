package patterns.abstractfactory;

// 4. Конкретная фабрика мебели в стиле Викторианский
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}