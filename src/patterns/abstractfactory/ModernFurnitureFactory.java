package patterns.abstractfactory;

// 4. Конкретная фабрика мебели в стиле Модерн
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}