package patterns.abstractfactory;

// 3. Абстрактная фабрика мебели
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}